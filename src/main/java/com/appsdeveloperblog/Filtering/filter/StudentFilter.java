package com.appsdeveloperblog.Filtering.filter;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
@Component

public class StudentFilter implements Filter{
	
	
	private static final Logger log = LoggerFactory.getLogger(StudentFilter.class);

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		
		log.info(
				"{Filtered} staring a transaction for req: {}",
				req.getRequestURI());
		
		chain.doFilter(request, response);
		
		log.info(
				"{Filtered} Commiting a transaction for req: {}",
				req.getRequestURI());
	}

}
