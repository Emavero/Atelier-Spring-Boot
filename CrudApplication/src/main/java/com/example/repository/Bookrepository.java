package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Book;

@Repository
public interface Bookrepository  extends JpaRepository<Book,Long>{

}
