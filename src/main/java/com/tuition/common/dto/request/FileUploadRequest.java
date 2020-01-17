package com.tuition.common.dto.request;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
@ApiModel
public class FileUploadRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -320225710598756978L;
	
	@ApiParam(name="quoteId")
	private String quoteId;
	@ApiParam(name="file")
	private MultipartFile  multipartFile;
	
	
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public MultipartFile getMultipartFile() {
		return multipartFile;
	}
	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}
	
}
