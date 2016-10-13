

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
  
	// 创建WebService客户端代理工厂
	 JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
	 // 注册WebService接口
	  factory.setServiceClass(TestServiceImpl.class);
	 // 设置WebService地址
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
//3.使用CXF 调用
public static void main(String[] args) throws Exception {
	/*//这个是用cxf 客户端访问cxf部署的webservice服务
	//千万记住，访问cxf的webservice必须加上namespace ,否则通不过
	//现在又另外一个问题，传递过去的参数服务端接收不到
	JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
	 String endpoint="http://localhost:8080/webservices/lovo?wsdl";
	//String endpoint= "http://localhost:8080/facelook/services/facelookWebService?wsdl";
	org.apache.cxf.endpoint.Client client = dcf.createClient(endpoint);
	//url为调用webService的wsdl地址
	//String namespace="http://server.webservice.facelook.com/";
	String namespace="http://localhost:8080/webservices";
	String methodName="say";
	QName name=new QName(namespace,methodName);
	//namespace是命名空间，methodName是方法名
	String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
	+ " <facelook>"
	+ " <condition>"
	+ " <name>家</name>"
	+ " <description></description>"
	+ " <pageno></pageno>"
	+ " <pagesize></pagesize>"
	+ " </condition>"
	+ " </facelook>";
	//paramvalue为参数值
	Object[] objects=client.invoke(name,xmlStr);
	//调用web Service//输出调用结果
	System.out.println(objects[0].toString());*/
	} 
}