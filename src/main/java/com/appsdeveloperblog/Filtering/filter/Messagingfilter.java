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
import jakarta.servlet.http.HttpServletResponse;
@Component
public class Messagingfilter implements Filter{
	
	
	private static final Logger log = LoggerFactory.getLogger(Messagingfilter.class);

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		String header = req.getHeader("api");
	System.out.println(header);
		log.info(
				"{Messaging Filter} staring a transaction for req: {}",
				req.getRequestURI());
		if(header == null) {
//			chain.doFilter(request, response);
			res.sendError(400);
			
		}
		chain.doFilter(request, response);
		
		log.info(
				"{Messaging Filter} Committing a transaction for req: {}",
				req.getRequestURI());
	}

}
