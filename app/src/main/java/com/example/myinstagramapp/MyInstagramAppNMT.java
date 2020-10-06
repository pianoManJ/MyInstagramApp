package com.example.myinstagramapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class MyInstagramAppNMT extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("djKjNohyV38Yha9rPWX6aIucu3LbUDLCEQhF8mMl")
                .clientKey("CkBAwvEuQYqlh6rZsD6MXzWc7UsViXLH64yJHlXq")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
