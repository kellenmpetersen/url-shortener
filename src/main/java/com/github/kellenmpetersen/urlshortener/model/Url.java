package com.github.kellenmpetersen.urlshortener.model;

/**
 * Url
 * 
 * A resource (or domain object) that represents one entity stored
 * in the database.
 * 
 * hash: the unique hash associated with the longUrl
 * longURL: the long URL associated with the hash
 * @param shortURL: the short URL associated with the hash
 */

public class Url {
    private Long id;
    private Integer hash;
    private String longUrl;
    private String shortUrl;

    public Url(){

    }
    public Url(Long id, 
                Integer hash, 
                String longUrl, 
                String shortUrl){
        this.id = id;
        this.hash = hash;
        this.longUrl = longUrl;
        this.shortUrl = shortUrl;
    }
    public Url(Integer hash, 
            String longUrl, 
            String shortUrl){
        this.hash = hash;
        this.longUrl = longUrl;
        this.shortUrl = shortUrl;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Integer getHash(){
        return hash;
    }

    public void setHash(Integer hash){
        this.hash = hash;
    }

    public String getLongUrl(){
        return longUrl;
    }

    public void setLongUrl(String longUrl){
        this.longUrl = longUrl;
    }

    public String getShortUrl(){
        return shortUrl;
    }

    public void setShortUrl(String shortUrl){
        this.shortUrl = shortUrl;
    }

    @Override
    public String toString(){
        return "Url{" +
                "id=" + id +
                ", hash=" + hash +
                ", longUrl=" + longUrl +
                ", shortUrl=" + shortUrl +
                "}";
    }
 }