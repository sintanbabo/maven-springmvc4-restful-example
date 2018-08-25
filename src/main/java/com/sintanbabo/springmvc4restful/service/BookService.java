package com.sintanbabo.springmvc4restful.service;

import java.util.List;
import com.sintanbabo.springmvc4restful.model.Book;

public interface BookService {

   long save(Book book);
   Book get(long id);
   List<Book> list();
   void update(long id, Book book);
   void delete(long id);
}
