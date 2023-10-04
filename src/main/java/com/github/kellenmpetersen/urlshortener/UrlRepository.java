package com.github.kellenmpetersen.urlshortener;

public interface UrlRepository{

    public String put(String hash, String url);

    public String get(String hash);

}