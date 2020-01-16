package com.tuation.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuation.common.dto.FileResponse;
import com.tuation.common.service.CommonLookUpService;

@RestController
public class FileUploadController {
	
	@Autowired
	private CommonLookUpService commonLookupService;

	@PostMapping(name="/uploadFile")
	public FileResponse uploadFile() {
		
		return null;
		
	}
	@PostMapping(name="/uploadBulkFile")
	public FileResponse uploadBulkFile() {
		return null;
		
	}
}
