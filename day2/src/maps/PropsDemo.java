package maps;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class PropsDemo {

	public static void main(String[] args) {
		
		Properties props=System.getProperties();
		
		Enumeration<Object> keys= props.keys();
		
		while(keys.hasMoreElements()) {
			Object key=keys.nextElement();
			System.out.println(key+" ----> "+props.getProperty(key.toString()));
		}

	}

}
