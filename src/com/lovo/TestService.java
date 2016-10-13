package com.lovo;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.lovo.po.Book;
import com.lovo.po.Person;
//首先定义服务接口
@WebService
@SOAPBinding(style = Style.DOCUMENT,use = Use.LITERAL)
public interface TestService {
    @WebMethod
   // public Person say(Book s);
    public Person say();
}
//@SOAPBinding(style = Style.DOCUMENT,use = Use.LITERAL) 指明绑定方式为DOCUMENT。

//按照WS-I指导原则，use属性的取值选择literal。





