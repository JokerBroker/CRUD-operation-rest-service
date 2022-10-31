package com.karthik.springbootcrud.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{
	public static final long serialVersionUID = 1L;
	public ResourceNotFoundException(String message)
	{
		super(message);
	}
}
