package config.properties;

import java.io.FileInputStream;

import java.io.InputStream;
import java.util.Properties;

public class As {

	public static Properties prop;
	public static void ed() {
		prop=new Properties();
		String projectpath=System.getProperty("user.dir");
		try {
			InputStream input= new FileInputStream(projectpath+"\\src\\main\\java\\config\\properties\\config.properties\\config.properties");
			prop.load(input);
			String sd=prop.getProperty("browser");
			System.out.println(sd);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ed();
	}
}
