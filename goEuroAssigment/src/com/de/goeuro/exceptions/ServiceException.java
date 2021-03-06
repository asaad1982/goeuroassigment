package com.de.goeuro.exceptions;

import java.util.List;


public class ServiceException extends Exception {

	private static final long serialVersionUID = -6854945379036729034L;
	private int exceptionType = 0;//regular error
	



	public final static int EXCEPTION_NOTFOUND = 99;
	
	private String messageCode = null;
	private List<String>messageCodes;


	public List<String> getMessageCodes() {
		return messageCodes;
	}

	public void setMessageCodes(List<String> messageCodes) {
		this.messageCodes = messageCodes;
	}

	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}

	public ServiceException() {
		super();
	}
	public ServiceException(List<String> messageCodes) {
		super();
		this.messageCodes = messageCodes;
	}

	public ServiceException(String messageCode) {
		super();
		this.messageCode = messageCode;
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}
	
	public ServiceException(int exceptionType) {
		super();
		this.exceptionType = exceptionType;
	}
	
	public ServiceException(int exceptionType, String message) {
		super(message);
		this.exceptionType = exceptionType;
	}
	
	public ServiceException(int exceptionType, String message, String messageCode) {
		super(message);
		this.messageCode = messageCode;
		this.exceptionType = exceptionType;
	}
	public ServiceException(  String messageCode,String message) {
		super(message);
		this.messageCode = messageCode;
		
	}
	
	public int getExceptionType() {
		return exceptionType;
	}
	
	public void setExceptionType(int exceptionType) {
		this.exceptionType = exceptionType;
	}
	
	public String getMessageCode() {
		return messageCode;
	}

}