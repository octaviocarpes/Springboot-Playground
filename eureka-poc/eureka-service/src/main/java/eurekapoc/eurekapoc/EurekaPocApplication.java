package eurekapoc.eurekapoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaPocApplication.class, args);
	}
}