package com.example.osx.rxjavav;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Type;

import retrofit.converter.ConversionException;
import retrofit.converter.Converter;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

public class JacksonConverter implements Converter {
    private ObjectMapper mapper=new ObjectMapper();


    @Override
    public Object fromBody(TypedInput body, Type type) throws ConversionException {
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT,true);
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY,true);
        mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE,true);
        mapper.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY,true);
        mapper.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, true);
        mapper.setPropertyNamingStrategy(new PropertyNamingStrategy.PascalCaseStrategy());
        JavaType javaType = mapper.getTypeFactory().constructType(type);

        try {
            return mapper.readValue(body.in(), javaType);
        } catch (IOException e) {
            throw new ConversionException(e);
        }
    }

    @Override
    public TypedOutput toBody(Object object) {
        try {
            String charset = "UTF-8";
            String json = mapper.writeValueAsString(object);
            return new JsonTypedOutput(json.getBytes(charset));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    private static class JsonTypedOutput implements TypedOutput {
        private final byte[] jsonBytes;

        JsonTypedOutput(byte[] jsonBytes) { this.jsonBytes = jsonBytes; }

        @Override public String fileName() { return null; }
        @Override public String mimeType() { return "application/json; charset=UTF-8"; }
        @Override public long length() { return jsonBytes.length; }
        @Override public void writeTo(OutputStream out) throws IOException { out.write(jsonBytes); }
    }
}