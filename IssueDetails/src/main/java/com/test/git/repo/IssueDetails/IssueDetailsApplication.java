package com.test.git.repo.IssueDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

import org.apache.juli.logging.LogConfigurationException;
import org.apache.juli.logging.LogFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class IssueDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssueDetailsApplication.class, args);
	}
	@RequestMapping("/")
	public String hello() {
		HttpHeaders headers = new HttpHeaders();
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<String> reqent = new HttpEntity<>(headers);
		ResponseEntity<String> response =  restTemplate.exchange("https://api.github.com/orgs/att/repos",HttpMethod.GET,reqent, String.class);
		//List<Repo> repos = new ArrayList<Repo>(); 
	
		
		//String response = restTemplate.getForObject("https://api.github.com/orgs/att/issues?client_id=muni-annachi&client_secret=4da7c99d06e28d6bb148c4b6e650bc14a7f40d7d", String.class);
		return response.getBody();
	}
}
