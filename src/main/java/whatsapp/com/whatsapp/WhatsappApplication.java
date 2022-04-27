package whatsapp.com.whatsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WhatsappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhatsappApplication.class, args);
	}

		@Bean
		public RestTemplate restTemplate(){
		return new RestTemplate();
		}

}
