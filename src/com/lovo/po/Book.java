package com.lovo.po;

public class Book {   
    public Book(){
    }
   
    public Book(int i,String n){
        this.id = i;
        this.name = n;
    }

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
    private int id;
    private String name;
}

 


