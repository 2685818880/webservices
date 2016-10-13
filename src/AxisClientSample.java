import java.net.URL;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
/*目前比较流行的提供远程服务的技术中，WebService算是比较流行之一。因此，在调用WebService远程服务的客户端代码也是我们经常碰到的。本人把自己在开发中调用WebService远程服务的客户端代码总结下，算是留个笔记，方便以后使用。
1.使用Axis调用
    如果提供的远程服务方法传入的参数都是简单类型，可以不用生成客户端代码，直接手动编写调用远程服务代码。
    查看wsdl描述文件，wsdl:portType 暴露的是远程接口名称；wsdl:operation 对应的name 为远程接口暴露的方法
一般情况下 wsdl:definitions 定义的targetNamespace对应的是接口的包的反向。*/
public class AxisClientSample {
 public static void main(String[] args) throws Exception {
  String[] recipients = new String[]{}; //收件人
  String strSubject = "";               //主题
  String strContent = "";      //内容
  String[] ccRecipients = new String[]{}; //抄送人
  String[] bccRecipients = null;     //密送人
  
  //String endPoint = "http://service_host:port/appProject/services/XXXXService";
  String endPoint="http://localhost:8080/webservices/lovo";
  Service server = new Service();
  Call call = (Call) server.createCall();
  call.setTargetEndpointAddress(new URL(endPoint));
  //call.getMessageContext().setUsername("username");  //如果远程方法需要用户名和密码验证时
  //call.getMessageContext().setPassword("password");
  
  String resp = (String) call.invoke("say", new Object[]{recipients,strSubject,strContent,ccRecipients,bccRecipients});
  System.out.println(resp);
 }
}
 
//如果参数是复杂类型或者自定义pojo时，使用Axis对wsdl文件生成客户端代码，使用Axis的WSDL2JAVA生成客户端代码，编写调用代码如下：
 // XXXXServiceService service = new XXXXXLocator(); //获取远程服务
  // XXXXService stub = service.getXXXXService();  //XXXXService是远程服务接口类
   //构建参数args  , 实际调用远程服务方法
  //  stub.exposeMethod(args);