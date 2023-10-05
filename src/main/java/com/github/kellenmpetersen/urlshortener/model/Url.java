package com.github.kellenmpetersen.urlshortener.model;

/**
 * Url
 * 
 * A resource (or domain object) that represents one entity stored
 * in the database.
 * 
 * @param hash: the unique hash associated with the longUrl
 * @param longURL: the long URL associated with the hash
 * @param shortURL: the short URL associated with the hash
 */
public record Url(int hash, String longUrl, String shortUrl) { }