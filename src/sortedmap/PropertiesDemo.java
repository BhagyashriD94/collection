package sortedmap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		
		Properties p=new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\Anvit\\Desktop\\New folder\\abc.properties");
		p.load(fis);
		System.out.println(p);
		String s=p.getProperty("Rani");
		System.out.println(s);
		p.setProperty("Radha", "88888");
		FileOutputStream fos =new FileOutputStream("C:\\Users\\Anvit\\Desktop\\New folder\\abc.properties");
		p.store(fos,"Update by Durga for SCJP Demo class");
		

	}

}
