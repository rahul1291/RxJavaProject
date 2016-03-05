package com.example.osx.rxjavav;

import retrofit.RestAdapter;
import retrofit.converter.*;

/**
 * Created by osx on 09/10/15.
 */
public class ServiceFactory {
    static <T> T createRetrofitService(final Class<T> clazz, final String endPoint) {
        //set converter new JacksonConverter for jackson
        final RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(endPoint)
                .build();
        T service = restAdapter.create(clazz);
        return service;
    }


}
