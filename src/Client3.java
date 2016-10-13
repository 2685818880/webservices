

import java.net.URL;

import org.codehaus.xfire.client.Client;
import org.junit.Test;

public class Client3 {
	@Test
    public void testUserLogin(){
	//param.setHostName("http://www.webservicex.net/whois.asmx?wsdl");
	
	}
	public static void main(String[] args) {
		try {
	        String methodName = "http://lovo.com/";
	        //float param1 = 1f;
	        //float param2 = 2f;
	        String url = "http://localhost:8080/webservices/lovo?wsdl";
	        Client client = new Client(new URL(url));
	         //http://localhost:8080/webservices/lovo?xsd=1
	        Object[] resultInfo = client.invoke(methodName,new Object[]{null});
	        if (null != resultInfo && resultInfo.length > 0) {
	            System.out.println(resultInfo[0]);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
