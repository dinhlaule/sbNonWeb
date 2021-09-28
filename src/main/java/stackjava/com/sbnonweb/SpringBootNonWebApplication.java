package stackjava.com.sbnonweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import stackjava.com.sbnonweb.service.HelloService;

@SpringBootApplication
public class SpringBootNonWebApplication implements CommandLineRunner {
	@Autowired
	HelloService helloService;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringBootNonWebApplication.class);
		app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		helloService.hello();
	}
}