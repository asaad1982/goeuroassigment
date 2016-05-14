package com.de.goeuro.exceptions;

public class SystemException extends Throwable{
	private String messageCode = null;
	public SystemException(String message) {
		this.messageCode=message;
	}
	public String getMessageCode() {
		return messageCode;
	}
	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}
	public int getExceptionType() {
		return exceptionType;
	}
	public void setExceptionType(int exceptionType) {
		this.exceptionType = exceptionType;
	}
	private int exceptionType = 0;//regular error
}
