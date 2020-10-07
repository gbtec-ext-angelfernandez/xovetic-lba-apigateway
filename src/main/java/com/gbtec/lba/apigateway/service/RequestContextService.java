package com.gbtec.lba.apigateway.service;

import org.springframework.stereotype.Service;

import com.netflix.zuul.context.RequestContext;

@Service
public class RequestContextService {

	public RequestContext getCurrentRequestContext() {
		return RequestContext.getCurrentContext();
	}
}
