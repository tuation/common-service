package com.tuition.common.dto;

import java.io.Serializable;

public class FileResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8018350586760024460L;
	
	private String quoteId ;
	private String status;
	private String message;
	private String registractionNumber;
	
	
	
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getRegistractionNumber() {
		return registractionNumber;
	}
	public void setRegistractionNumber(String registractionNumber) {
		this.registractionNumber = registractionNumber;
	}
	
	
	@Override
	public String toString() {
		return "FileResponse [quoteId=" + quoteId + ", status=" + status + ", message=" + message
				+ ", registractionNumber=" + registractionNumber + "]";
	}
	
	
}
