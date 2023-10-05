package com.github.kellenmpetersen.urlshortener.service;

import com.github.kellenmpetersen.urlshortener.model.Url;

import java.util.HashMap;

public class UrlServiceImpl implements UrlService {
    private HashMap<String,String> hashmap;

    public UrlServiceImpl(){
        hashmap = new HashMap<>();
    }

    public String put(String hash, String url){
        //TODO: ensure idempotent behavior (no rewriting over an existing hash)
        return hashmap.put(hash,url);
    }

    public String get(String hash){
        //TODO: ensure proper handling of null
        return hashmap.get(hash);
    }
}
