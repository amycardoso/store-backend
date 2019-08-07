package com.nelioalves.cursomc.services.exceptions;

public class DataIntegrityException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DataIntegrityException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	public DataIntegrityException(String msg, Throwable cause) {
		super(msg, cause);
		// TODO Auto-generated constructor stub
	}	
}
