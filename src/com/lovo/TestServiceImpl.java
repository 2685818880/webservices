package com.lovo;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.lovo.po.Book;
import com.lovo.po.Person;
//Ȼ��ʵ�ַ���ӿ�

//��ʵ�ֽӿ�ʱͨ��

//@WebService(endpointInterface="com.lovo.TestService")ָ������ӿڵ�ȫ������
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