package com.jk.controller.book;

import com.jk.pojo.book.Book;
import com.jk.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 2017/5/15.
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("insertBook")
    public String insertBook(Book book) {
        bookService.insertBook(book);
        return null;
    }

}
