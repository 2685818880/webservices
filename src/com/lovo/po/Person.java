package com.lovo.po;

import java.util.List;
//在接口和实现类中出现的Peson和Book是2个pojo。
public class Person {
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Book> getBookList() {
        return bookList;
    }
    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
    private int id;
    private String name;
    private List<Book> bookList;
    private Book book;
   
}