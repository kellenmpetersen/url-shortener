package com.github.kellenmpetersen.urlshortener;

import java.util.HashMap;

public class UrlRepositoryHashMap implements UrlRepository {
    private HashMap<String,String> hashmap;

    public UrlRepositoryHashMap(){
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
