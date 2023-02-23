package com.appsdeveloperblog.Filtering;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RequestResponseLoggingFilter implements Filter{

	private static final Logger log = LoggerFactory.getLogger(RequestResponseLoggingFilter.class);
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		log.info(
				"Logging request {} : {}", req.getMethod(),
				req.getRequestURI());
		chain.doFilter(request, response);
		log.info(
				"Logging Response :{}",
				res.getContentType());
	}
	

}
