package com.example.osx.rxjavav;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONArray;

import java.util.Map;

import retrofit.http.Body;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.QueryMap;
import rx.Observable;

/**
 * Created by osx on 09/10/15.
 */
public interface GithubService {
    String SERVICE_ENDPOINT = "https://api.github.com";

    String COMMON_URL="http://europa.promaticstechnologies.com/socialfit360";

    String COMMON_URL1="http://jupiter1.promaticstechnologies.com/DirectVet";

    String COMMON_URL2="http://www.w3schools.com";

    @GET("/users/{login}")
    Observable<Github> getUser(@Path("login") String login);

    @POST("/files/json.php")
    Observable<JsonArray> login();

    @GET("/mobile/search/speciality")
    Observable<Special> getspecialities();

    @FormUrlEncoded
    @POST("/SignIn/SignIn")
    Observable<JsonObject> loginn(@FieldMap Map<String,String> map);

    @FormUrlEncoded
    @POST("/mobile/users/login")
    Observable<JsonObject> logined(@FieldMap Map<String,String> map);


    @GET("/mobile/find_states")
    Observable<States> getstates();

    @GET("/xml/simple.xml")
    Observable<BreakFastMenu> getDetails();
}
