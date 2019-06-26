package com.elasticsearch.service.validation;

import java.net.BindException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.SmartValidator;
import org.springframework.web.bind.support.WebExchangeBindException;


@Component
public class ValidationServiceImpl implements ValidationService {
	
	@Autowired
	SmartValidator validator;
	
	@Override
	public void validate(Object request) throws org.springframework.validation.BindException {
		Errors errors = new BeanPropertyBindingResult(request, "request");
		validator.validate(request, errors);
		if(errors.hasErrors()) {
			throw new org.springframework.validation.BindException((BindingResult)errors);
		}
	}

	
}
