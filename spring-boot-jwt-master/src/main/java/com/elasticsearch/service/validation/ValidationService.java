package com.elasticsearch.service.validation;

import org.springframework.validation.BindException;

public interface ValidationService {

	public void validate(Object request) throws BindException;

}
