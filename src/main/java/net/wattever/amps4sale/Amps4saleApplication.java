package net.wattever.amps4sale;

import com.stripe.Stripe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Amps4saleApplication {

	@PostConstruct
	public void setup(){
		Stripe.apiKey="";
	}
	public static void main(String[] args) {
		SpringApplication.run(Amps4saleApplication.class, args);
	}
}
