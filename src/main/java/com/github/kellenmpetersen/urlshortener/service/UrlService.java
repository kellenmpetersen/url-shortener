package com.github.kellenmpetersen.urlshortener.service;

import com.github.kellenmpetersen.urlshortener.model.Url;

public interface UrlService {

    public String put(String hash, String url);

    public String get(String hash);

}