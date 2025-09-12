package com.example.DevVerse.service;


	
	

	import org.springframework.beans.factory.annotation.Value;
	import org.springframework.http.ResponseEntity;
	import org.springframework.stereotype.Service;
	import org.springframework.web.client.RestTemplate;

	import java.util.HashMap;
	import java.util.Map;

	@Service
	public class CompilerService {

	    private final RestTemplate restTemplate;

	    @Value("${jdoodle.clientId}")
	    private String clientId;

	    @Value("${jdoodle.clientSecret}")
	    private String clientSecret;

	    @Value("${jdoodle.endpoint:https://api.jdoodle.com/v1/execute}")
	    private String endpoint;

	    public CompilerService(RestTemplate restTemplate) {
	        this.restTemplate = restTemplate;
	    }

	    /**
	     * Execute code via JDoodle API and return the response body as Map
	     */
	    public Map<String, Object> execute(String code, String language, String versionIndex) {
	        Map<String, Object> request = new HashMap<>();
	        request.put("clientId", clientId);
	        request.put("clientSecret", clientSecret);
	        request.put("script", code);
	        request.put("language", language);
	        request.put("versionIndex", versionIndex);

	        ResponseEntity<Map> resp = restTemplate.postForEntity(endpoint, request, Map.class);
	        // resp.getBody() usually contains fields like output, statusCode, memory, cpuTime
	        return resp.getBody();
	    }
	}



