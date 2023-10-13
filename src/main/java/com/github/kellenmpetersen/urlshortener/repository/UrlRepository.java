package com.github.kellenmpetersen.urlshortener.repository;

import org.springframework.stereotype.Repository;

import com.github.kellenmpetersen.urlshortener.model.Url;

/**
 * UrlRepository
 * 
 * Persistence Layer:
 * Provides an interface for accessing the database.
 * 
 * Repository (DAO: Data Access Object)
 * implements CRUD operations
 * 
 * ORM (Object Relational Mapping) frameworks
 * used implement CRUD operations instead of SQL
 * (i.e. Hibernate)
 */
@Repository
public interface UrlRepository {

}