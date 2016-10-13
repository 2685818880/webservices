package com.lovo;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.lovo.po.Book;
import com.lovo.po.Person;
//然后实现服务接口

//在实现接口时通过

//@WebService(endpointInterface="com.lovo.TestService")指定服务接口的全类名。
@WebService(endpointInterface="com.lovo.TestService")
public class TestServiceImpl implements TestService{

    public Person say(){
        Person p = new Person();
        p.setId(4);
        List<Book> list = new ArrayList<Book>();
        list.add(new Book(1,"w"));
        list.add(new Book(2,"s"));
        list.add(new Book(3,"t"));
        p.setBookList(list);
        return p;
    }

}