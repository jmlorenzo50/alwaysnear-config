package es.alwaysnear.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AlwaysnearConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlwaysnearConfigApplication.class, args);
	}

}
