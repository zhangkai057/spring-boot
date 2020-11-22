package org.springframework.boot;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication(scanBasePackages={"org.springframework.boot"})
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
