

import javax.xml.namespace.QName;

import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import com.lovo.TestServiceImpl;
import com.lovo.po.Book;
public class CXFClientSample {
 /*public static void main(String[] args) throws Exception{
	 String endpoint="http://localhost:8080/webservices/lovo?wsdl";
  JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
  
  factory.setServiceClass(TestServiceImpl.class);
  factory.setAddress(endpoint);
  TestServiceImpl service = (TestServiceImpl) factory.create();
  String username="sample";
  System.out.println(username);
  String response = service.executeMethod(username);
  System.out.println(response);
  System.out.println(service.say(s));
  
	// ����WebService�ͻ��˴�����
	 JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
	 // ע��WebService�ӿ�
	  factory.setServiceClass(TestServiceImpl.class);
	 // ����WebService��ַ
	 factory.setAddress("http://localhost:8080/webservices/lovo");
	 TestServiceImpl service = (TestServiceImpl) factory.create();
	 System.out.println("invoke webservice...");
	 System.out.println("message context is:" + service.say(new Book()));
	 //System.exit(0);
	 
  
  ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
  factory.setServiceClass(TestServiceImpl.class);
  factory.setAddress(
  "http://localhost:8080/vo/services/SampleWebService");
  TestServiceImpl client = (TestServiceImpl)factory.create();
  System.out.println("Invoke execute()....");
  System.out.println(client.say(new Book()));
  
 }
}*/
//3.ʹ��CXF ����
public static void main(String[] args) throws Exception {
	/*//�������cxf �ͻ��˷���cxf�����webservice����
	//ǧ���ס������cxf��webservice�������namespace ,����ͨ����
	//����������һ�����⣬���ݹ�ȥ�Ĳ�������˽��ղ���
	JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
	 String endpoint="http://localhost:8080/webservices/lovo?wsdl";
	//String endpoint= "http://localhost:8080/facelook/services/facelookWebService?wsdl";
	org.apache.cxf.endpoint.Client client = dcf.createClient(endpoint);
	//urlΪ����webService��wsdl��ַ
	//String namespace="http://server.webservice.facelook.com/";
	String namespace="http://localhost:8080/webservices";
	String methodName="say";
	QName name=new QName(namespace,methodName);
	//namespace�������ռ䣬methodName�Ƿ�����
	String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
	+ " <facelook>"
	+ " <condition>"
	+ " <name>��</name>"
	+ " <description></description>"
	+ " <pageno></pageno>"
	+ " <pagesize></pagesize>"
	+ " </condition>"
	+ " </facelook>";
	//paramvalueΪ����ֵ
	Object[] objects=client.invoke(name,xmlStr);
	//����web Service//������ý��
	System.out.println(objects[0].toString());*/
	} 
}