package com.example.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Book;
import com.example.repository.Bookrepository;

@Service
public class BookService {
    

    @Autowired
    private Bookrepository bookrepository;

    public List<Book> findAll(){
        return bookrepository.findAll();
    }

    public Optional<Book> findById(Long id){
        return bookrepository.findById(id);
    }

    public Book save(Book book){
        return bookrepository.save(book);
    }

    public void deleteById(Long id){
        bookrepository.deleteById(id);
    }
}
