package com.planets.StarWarsClientApplication.controllers;

import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import com.planets.StarWarsClientApplication.dtos.PlanetDTO;
import com.planets.StarWarsClientApplication.handler.ErrorHandler;

@RestController
public class PlanetClientController {
	
	@PostMapping(value = "/client/planets", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public PlanetDTO adicionaPlaneta(@RequestBody PlanetDTO planeta) throws Exception {
		
		PlanetDTO response = null;
		
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			URI uri = new URI("http://localhost:8000/planets");
			response = new RestTemplate().postForObject(uri, 
					new HttpEntity<PlanetDTO>(planeta, headers), PlanetDTO.class);
		} catch (HttpClientErrorException e) {
			 e.printStackTrace();
			 throw new RuntimeException();
		}
		return response;
	}
	
	@GetMapping(value = "/client/planets/all", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PlanetDTO> listaPlanetas() throws Exception {
		
		ResponseEntity<PlanetDTO> response = null;
		
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			response = new RestTemplate().getForEntity("http://localhost:8000/planets/", PlanetDTO.class);
		} catch (HttpClientErrorException e) {
			 e.printStackTrace();
			 throw new RuntimeException();
		}
		return response;
	}
	
	@GetMapping(value = "/client/planets/nome/{nome}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PlanetDTO> listaPlanetaPorNome(@PathVariable("nome") String nome) throws Exception {
		
		ResponseEntity<PlanetDTO> response = null;
		
		Map<String, Object> mapping = new HashMap<>();
		mapping.put("nome", nome);		
		
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			RestTemplate template = new RestTemplate();
			template.setErrorHandler(new ErrorHandler());
			response = template.getForEntity("http://localhost:8000/planets/nome/{nome}", PlanetDTO.class, mapping);
		} catch (HttpClientErrorException e) {
			 e.printStackTrace();
			 throw new RuntimeException();
		}
		return response;
	}
	
	@GetMapping(value = "/client/planets/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PlanetDTO> listaPlanetaPorId(@PathVariable("id") Long id) throws Exception {
		
		ResponseEntity<PlanetDTO> response = null;
		
		Map<String, Object> mapping = new HashMap<>();
		mapping.put("id", id);
		
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			response = new RestTemplate().getForEntity("http://localhost:8000/planets/id/{id}", PlanetDTO.class, mapping);
		} catch (HttpClientErrorException e) {
			 e.printStackTrace();
			 throw new RuntimeException();
		}
		return response;
	}
	
	@DeleteMapping(value = "/client/planets/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void removePlaneta(@PathVariable("id") Long id) throws Exception {
		
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			new RestTemplate().delete("http://localhost:8000/planets/{id}");
		} catch (HttpClientErrorException e) {
			 e.printStackTrace();
			 throw new RuntimeException();
		}
	}
}
