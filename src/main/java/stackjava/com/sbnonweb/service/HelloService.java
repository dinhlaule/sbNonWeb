package stackjava.com.sbnonweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

	@Autowired
	Environment env;
	
	public void hello() {
		System.out.println(env.getProperty("message"));
	}
}
