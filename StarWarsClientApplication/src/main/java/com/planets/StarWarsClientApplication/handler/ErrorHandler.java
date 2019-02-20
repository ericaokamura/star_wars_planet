package com.planets.StarWarsClientApplication.handler;

import java.io.IOException;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;

public class ErrorHandler extends DefaultResponseErrorHandler {
	
	  @Override
	  public void handleError(ClientHttpResponse response) throws IOException {
	    // your error handling here
	  }
	}