package Filetestcase;
import java.util.Map;
import org.testng.annotations.Test;

import Hook.Hooks;

public class Testcase extends Hooks {
	
	@Test
	public void Login() {
		log.info("\nWelcme to Login testcase");
		for (Map.Entry<String, String> map:data.entrySet()) {
			log.info("Key : "+map.getKey() +" Value : "+map.getValue());
		}
	}
	
	@Test
	public void Address() {
		log.info("\nWelcme to Address testcase");
		for (Map.Entry<String, String> map:data.entrySet()) {
			log.info("Key : "+map.getKey() +" Value : "+map.getValue());
		}
	}
	
	@Test
	public void Book() {
		log.info("\nWelcme to Book testcase");
		for (Map.Entry<String, String> map:data.entrySet()) {
			log.info("Key : "+map.getKey() +" Value : "+map.getValue());
		}
	}
	
	@Test
	public void Desktop() {
		log.info("\nWelcme to Desktop testcase");
		for (Map.Entry<String, String> map:data.entrySet()) {
			log.info("Key : "+map.getKey() +" Value : "+map.getValue());
		}
	}
	
}