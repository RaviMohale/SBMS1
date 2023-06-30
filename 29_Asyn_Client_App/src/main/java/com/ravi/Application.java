package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class Application {

	static String url = "http://13.232.253.164:8080/ticket/{ticketNum}";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		WebClient webClient = WebClient.create();

		System.out.println("request sending start");
		 webClient.get().uri(url, 6)
						.retrieve()
						.bodyToMono(String.class)
						.subscribe(Application::handleRespons);

		System.out.println("request sending end");
		
	}
	
	public static void handleRespons(String response) {
		System.out.println(response);
	}

}
