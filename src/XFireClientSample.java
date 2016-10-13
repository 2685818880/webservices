import java.net.MalformedURLException;
/*import org.codehaus.xfire.XFireFactory;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;*/
 //方法同上，简单参数可以直接手写调用代码，复杂类型可以生成客户端代码。（为方便，当然手动也是可以的，如果你不嫌麻烦的话 -:））
//XFire 需要得到远程服务的接口类，可以根据wsdl描述得到对应的包名，接口名称和方法名，手动编写接口类，比如 XXXService.
public class XFireClientSample {
 public static void main(String[] args) {
  /*Service srModel = new ObjectServiceFactory().create(XXXService.class);
  XFireProxyFactory factory = new XFireProxyFactory(XFireFactory.newInstance().getXFire());
  String endPoint = "http://service_host:port/app/services/XXXService";
  try {
   XXXService service = (XXXService) factory.create(srModel, endPoint);
   String[] recipients = new String[] {}; // 收件人
   String strSubject = ""; // 主题
   String strContent = ""; // 内容
   String[] ccRecipients = new String[] {}; // 抄送人
   String[] bccRecipients = null; // 密送人
   System.out.print("提交返回：" + service.getMethod(recipients, strSubject, strContent, ccRecipients, bccRecipients));
  } catch (MalformedURLException e) {
   e.printStackTrace();
  }*/
 }
}