import java.net.URL;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
/*Ŀǰ�Ƚ����е��ṩԶ�̷���ļ����У�WebService���ǱȽ�����֮һ����ˣ��ڵ���WebServiceԶ�̷���Ŀͻ��˴���Ҳ�����Ǿ��������ġ����˰��Լ��ڿ����е���WebServiceԶ�̷���Ŀͻ��˴����ܽ��£����������ʼǣ������Ժ�ʹ�á�
1.ʹ��Axis����
    ����ṩ��Զ�̷��񷽷�����Ĳ������Ǽ����ͣ����Բ������ɿͻ��˴��룬ֱ���ֶ���д����Զ�̷�����롣
    �鿴wsdl�����ļ���wsdl:portType ��¶����Զ�̽ӿ����ƣ�wsdl:operation ��Ӧ��name ΪԶ�̽ӿڱ�¶�ķ���
һ������� wsdl:definitions �����targetNamespace��Ӧ���ǽӿڵİ��ķ���*/
public class AxisClientSample {
 public static void main(String[] args) throws Exception {
  String[] recipients = new String[]{}; //�ռ���
  String strSubject = "";               //����
  String strContent = "";      //����
  String[] ccRecipients = new String[]{}; //������
  String[] bccRecipients = null;     //������
  
  //String endPoint = "http://service_host:port/appProject/services/XXXXService";
  String endPoint="http://localhost:8080/webservices/lovo";
  Service server = new Service();
  Call call = (Call) server.createCall();
  call.setTargetEndpointAddress(new URL(endPoint));
  //call.getMessageContext().setUsername("username");  //���Զ�̷�����Ҫ�û�����������֤ʱ
  //call.getMessageContext().setPassword("password");
  
  String resp = (String) call.invoke("say", new Object[]{recipients,strSubject,strContent,ccRecipients,bccRecipients});
  System.out.println(resp);
 }
}
 
//��������Ǹ������ͻ����Զ���pojoʱ��ʹ��Axis��wsdl�ļ����ɿͻ��˴��룬ʹ��Axis��WSDL2JAVA���ɿͻ��˴��룬��д���ô������£�
 // XXXXServiceService service = new XXXXXLocator(); //��ȡԶ�̷���
  // XXXXService stub = service.getXXXXService();  //XXXXService��Զ�̷���ӿ���
   //��������args  , ʵ�ʵ���Զ�̷��񷽷�
  //  stub.exposeMethod(args);