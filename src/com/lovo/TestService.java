package com.lovo;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.lovo.po.Book;
import com.lovo.po.Person;
//���ȶ������ӿ�
@WebService
@SOAPBinding(style = Style.DOCUMENT,use = Use.LITERAL)
public interface TestService {
    @WebMethod
   // public Person say(Book s);
    public Person say();
}
//@SOAPBinding(style = Style.DOCUMENT,use = Use.LITERAL) ָ���󶨷�ʽΪDOCUMENT��

//����WS-Iָ��ԭ��use���Ե�ȡֵѡ��literal��





