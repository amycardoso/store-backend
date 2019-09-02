package com.nelioalves.cursomc.services.exceptions;

public class FileException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public FileException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	public FileException(String msg, Throwable cause) {
		super(msg, cause);
		// TODO Auto-generated constructor stub
	}	
}
