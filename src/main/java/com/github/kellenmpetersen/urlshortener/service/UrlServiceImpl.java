package com.github.kellenmpetersen.urlshortener.service;

import com.github.kellenmpetersen.urlshortener.model.Url;

import java.util.HashMap;

/**
 * UrlServiceImpl
 * 
 * Business Layer:
 * Implements core business logic.
 * 
 * For putting:
 * Creates a hash of the long URL
 * stores as key
 * checks if key already exists in HashMap
 * stores Url as record if key is unique
 */
public class UrlServiceImpl implements UrlService {
    private HashMap<Integer,String> hashmap;

    public UrlServiceImpl(){
        hashmap = new HashMap<>();
    }

    public String put(String longUrl){
        // TODO: ensure idempotent behavior (no rewriting over an existing hash)
        // create a hash of longURL
        // check database if hash exists, rehash if necessary
        int hash = longUrl.hashCode();
        return hashmap.put(hash,longUrl);
    }

    public String get(String longUrl){
        //TODO: ensure proper handling of null
        //create a hash of longURL
        int hash = longUrl.hashCode();
        return hashmap.get(hash);
    }
}
