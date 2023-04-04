package com.example.sandbox.domain.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j

@EnableConfigurationProperties(ServiceProperties.class)
public class MyService {

	private final ServiceProperties serviceProperties;

	public MyService(ServiceProperties serviceProperties) {
		this.serviceProperties = serviceProperties;
	}

	public String message() {
		return this.serviceProperties.getMessage();
	}
}
