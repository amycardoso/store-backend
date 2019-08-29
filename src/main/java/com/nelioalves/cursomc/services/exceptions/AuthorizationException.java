package com.nelioalves.cursomc.services.exceptions;

public class AuthorizationException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public AuthorizationException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	public AuthorizationException(String msg, Throwable cause) {
		super(msg, cause);
		// TODO Auto-generated constructor stub
	}	
}
