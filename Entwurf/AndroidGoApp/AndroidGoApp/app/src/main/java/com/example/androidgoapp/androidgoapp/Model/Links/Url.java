package com.example.androidgoapp.androidgoapp.Model.Links;

/**
 * Created by Theresa on 20.12.2016.
 */

public class Url {

    private String protocol;
    private String hostname;
    private String pathnameOfFile;
    private UrlSecret generatedSecret;

    public Url(int secret) {
        protocol = "http:";
        hostname = "androidGoApp.com";
        pathnameOfFile = "page1/page1.html";
        generatedSecret = new UrlSecret();
    }

}
