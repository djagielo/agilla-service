package me.djagielo.agillaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AgillaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgillaServiceApplication.class, args);
	}

	@RestController
	class TestController {
		@GetMapping("/ping")
		public String ping() {
			return "pong " + System.currentTimeMillis();
		}
	}
}
