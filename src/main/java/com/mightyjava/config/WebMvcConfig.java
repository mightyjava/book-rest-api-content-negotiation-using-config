package com.mightyjava.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//		http://localhost:8081/books/1.xml or http://localhost:8081/books.xml
//		http://localhost:8081/books/1.json or http://localhost:8081/books.json
		configurer.favorPathExtension(true).ignoreAcceptHeader(true).defaultContentType(MediaType.APPLICATION_JSON)
				.mediaType("xml", MediaType.APPLICATION_XML).mediaType("json", MediaType.APPLICATION_JSON);

//		http://localhost:8081/books/1?mediaType=xml or http://localhost:8081/books?mediaType=xml
//		http://localhost:8081/books/1?mediaType=json or http://localhost:8081/books?mediaType=json
//		configurer.favorPathExtension(false).favorParameter(true).parameterName("mediaType").ignoreAcceptHeader(true)
//				.defaultContentType(MediaType.APPLICATION_JSON).mediaType("xml", MediaType.APPLICATION_XML)
//				.mediaType("json", MediaType.APPLICATION_JSON);
	}
}
