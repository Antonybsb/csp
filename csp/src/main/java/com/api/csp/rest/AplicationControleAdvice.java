/*
package com.api.csp.rest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.api.csp.rest.exception.ApiErrors;

@RestControllerAdvice
public class AplicationControleAdvice {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ApiErrors handleValidationApiErrors(MethodArgumentNotValidException ex ) {
		BindingResult bindingResult = ex.getBindingResult();
		List<String> messages = bindingResult.getAllErrors() List<ObjectError>
		.stream() Stream<ObjectError>
		.map(ObjectError -> objectError.getDefaultMessage()) Stream<String>
		.collect(Collectors.toList());
		return new ApiErrors(messages);
	}
	
		
	

}
*/