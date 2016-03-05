package com.example.osx.rxjavav;

import android.app.ProgressDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;


public class MainActivity extends AppCompatActivity {

    Button btn_click;
    Button btn_chain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ResponseUsingGson();
        //ResponseUsingJackson();
        //getstatesusingjackson();
        getfoodxml();
    }


    public void ResponseUsingJackson() {
        ProgressDialogg.getDialog(this);
        GithubService service = ServiceFactory.createRetrofitService(GithubService.class, GithubService.SERVICE_ENDPOINT);
        service.getUser("linkedin").subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<Github>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                ProgressDialogg.dismisss();
                System.out.println("error" + e.getLocalizedMessage());
            }

            @Override
            public void onNext(Github github) {
                ProgressDialogg.dismisss();
                System.out.println("blog" + github.getBlog() + "\n" + "login" + github.getLogin());
            }
        });
    }

    public void ResponseUsingGson() {
        ProgressDialogg.getDialog(this);
        GithubService service = ServiceFactory.createRetrofitService(GithubService.class, GithubService.COMMON_URL1);
        service.getspecialities().subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<Special>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                ProgressDialogg.dismisss();
            }

            @Override
            public void onNext(Special special) {
                ProgressDialogg.dismisss();
                List<Speciality> speciality = special.getSpeciality();
                for (int i = 0; i < speciality.size(); i++) {
                    Speciality ss = speciality.get(i);
                    Speciality_ s1 = ss.getSpeciality();
                    System.out.println("id" + s1.getId());
                }
            }
        });
    }

    public void getstatesusingjackson() {
        ProgressDialogg.getDialog(this);
        GithubService servicefac = ServiceFactoryUsingJackson.createRetrofitService(GithubService.class, GithubService.COMMON_URL);
        servicefac.getstates().subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<States>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                ProgressDialogg.dismisss();
            }

            @Override
            public void onNext(States states) {
                ProgressDialogg.dismisss();
                List<State> state = states.getStates();
                for (int i = 0; i < state.size(); i++) {
                    State ss = state.get(i);
                    State_ statee = ss.getState();
                    System.out.println("state" + statee.getState());
                }
            }
        });
    }

    public void getfoodxml(){
        ProgressDialogg.getDialog(this);
        GithubService service=ServiceFactoryUsingXml.createRetrofitService(GithubService.class,GithubService.COMMON_URL2);
        service.getDetails().subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<BreakFastMenu>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                ProgressDialogg.dismisss();
                System.out.println("error"+e.getMessage());
            }

            @Override
            public void onNext(BreakFastMenu breakFastMenu) {
                ProgressDialogg.dismisss();
                List<Food> food=breakFastMenu.list;
                for(int i=0;i<food.size();i++){
                    String name=food.get(i).name;
                    System.out.println("name"+name);
                }
            }
        });

    }


}
