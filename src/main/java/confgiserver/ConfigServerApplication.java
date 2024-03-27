package configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@Configuration
@EnableAutoConfiguration
@EnableConfigServer

public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}

