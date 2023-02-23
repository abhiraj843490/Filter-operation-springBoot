package com.appsdeveloperblog.Filtering.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.appsdeveloperblog.Filtering.filter.Messagingfilter;
@Configuration
public class FilterConfiguration {
	@Bean
	public FilterRegistrationBean<Messagingfilter> loggingFilter(){
	   
		FilterRegistrationBean<Messagingfilter> registrationBean 
	      = new FilterRegistrationBean<>();
	        
	    registrationBean.setFilter(new Messagingfilter());
	    registrationBean.addUrlPatterns("/filter"); // both filter printed
	    //registrationBean.setOrder(2);
	        
	    return registrationBean;    
	}
}
