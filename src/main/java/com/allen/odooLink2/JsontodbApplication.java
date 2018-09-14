package com.allen.odooLink2;

import com.allen.odooLink2.domain.User;
import com.allen.odooLink2.service.UserService;
import com.allen.odooLink2.tools.JsonReader;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class JsontodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsontodbApplication.class, args); 
	}
	@Bean
	CommandLineRunner runner(UserService userService){
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
//			mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
			mapper.configure(Feature.AUTO_CLOSE_SOURCE, true);

			mapper.setSerializationInclusion(Include.NON_NULL);
			TypeReference<List<User>> typeReference = new TypeReference<List<User>>(){};
//			String url = "http://192.168.1.224:8080/api/customerAll/";
			
//			for(int i=1;i<10;i++) {
			  	int i = 22;  	
				String url = "http://54.223.173.85:8181/api/customer/"+i;
				String text= new JsonReader().url2String(url);
				
				InputStream inputStream = TypeReference.class.getResourceAsStream("/json/temp.json");
				
				try {
					List<User> users = mapper.readValue(inputStream,typeReference);
					for(int x=0;x<2;x++) {
						userService.save(users);
						 Thread.sleep(10000); 
					}
					System.out.println("Users Saved!");
				} catch (IOException e){
					System.out.println("Unable to save users: " + e.getMessage());
				}
//			}
			
	    };
	}
}
