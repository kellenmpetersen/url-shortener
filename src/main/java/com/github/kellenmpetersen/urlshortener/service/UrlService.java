package com.github.kellenmpetersen.urlshortener.service;

import com.github.kellenmpetersen.urlshortener.model.Url;

public interface UrlService {

    public String put(String longUrl);

    public String get(String longUrl);

}