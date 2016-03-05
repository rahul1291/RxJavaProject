package com.example.osx.rxjavav;

import retrofit.RestAdapter;
import retrofit.converter.*;
import retrofit.converter.JacksonConverter;

/**
 * Created by Rahull on 10/24/2015.
 */
public class ServiceFactoryUsingJackson {

    static <T> T createRetrofitService(final Class<T> clazz, final String endPoint) {
        final RestAdapter restAdapter = new RestAdapter.Builder()
                .setConverter(new JacksonConverter())
                .setEndpoint(endPoint)
                .build();
        T service = restAdapter.create(clazz);
        return service;
    }
}
