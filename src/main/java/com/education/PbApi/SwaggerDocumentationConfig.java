package com.education.PbApi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerDocumentationConfig {

	public HashSet<String> produceList = new HashSet <String> ();
	public HashSet<String> consumeList = new HashSet <String> ();
	
	
	 @Bean
	    public Docket apiDocket() {
	     produceList.add("application/json");
	     produceList.add("application/xml");
	     consumeList.add("application/json");
	     consumeList.add("application/xml");
		
	     return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.any())
	                .paths(PathSelectors.any())
	                .build().produces(produceList).consumes(consumeList);
	        
	        
	        
	    }
	
	
}
