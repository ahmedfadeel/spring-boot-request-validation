package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	private static final String GROUP_NAME = "TestApi";
	
    @Bean
    public Docket productApi() {	    
        return new Docket(DocumentationType.SWAGGER_2)  
        		.groupName(GROUP_NAME)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())                          
                .build().apiInfo(metaData())
                .useDefaultResponseMessages(false);        
    }
    
    private ApiInfo metaData() {
    	return new ApiInfoBuilder()
    			.title("test api")
    			.description("description")
    			.license("test license")
    			.version("0.1")
    			.build();
    }
    
}
