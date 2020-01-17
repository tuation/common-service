package com.tuition.common.controller;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tuition.common.dto.FileResponse;
import com.tuition.common.dto.request.FileUploadRequest;
import com.tuition.common.service.CommonLookUpService;

@RestController
public class FileUploadController {
	Logger logger = LoggerFactory.getLogger(FileUploadController.class);


	@Autowired
	private CommonLookUpService commonLookupService;

	@PostMapping(name="/uploadFile")
	public FileResponse uploadFile(@RequestBody FileUploadRequest fileUploadRequest) {

		logger.info("*******the quote id is ******"+fileUploadRequest.getQuoteId()+"and the file is:::::::"+fileUploadRequest.getMultipartFile());

		if(StringUtils.isNotBlank(fileUploadRequest.getQuoteId())
				&& StringUtils.isNotBlank(fileUploadRequest.getMultipartFile().getName())){

			try {
				commonLookupService.uploadFile(fileUploadRequest);
			}catch(Exception e){
				
			}


		}


		return null;

	}
	@PostMapping(name="/uploadBulkFile")
	public FileResponse uploadBulkFile() {
		return null;

	}
}
