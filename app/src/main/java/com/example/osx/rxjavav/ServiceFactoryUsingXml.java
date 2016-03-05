package com.example.osx.rxjavav;

import retrofit.RestAdapter;
import retrofit.converter.*;

/**
 * Created by Rahull on 10/25/2015.
 */
public class ServiceFactoryUsingXml {
    static <T> T createRetrofitService(final Class<T> clazz, final String endPoint) {
        final RestAdapter restAdapter = new RestAdapter.Builder()
                .setConverter(new SimpleXMLConverter())
                .setEndpoint(endPoint)
                .build();
        T service = restAdapter.create(clazz);
        return service;
    }
}
