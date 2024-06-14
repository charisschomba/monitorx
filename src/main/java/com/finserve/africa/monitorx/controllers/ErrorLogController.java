package com.finserve.africa.monitorx.controllers;

import com.finserve.africa.monitorx.entities.ErrorLog;
import com.finserve.africa.monitorx.services.ErrorLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ErrorLogController {

    private final ErrorLogServiceImpl logService;

    public ErrorLogController(ErrorLogServiceImpl logService) {
        this.logService = logService;
    }

    @PostMapping("/log")
    public ResponseEntity<String> logError(@RequestBody ErrorLog errorLog) {
        logService.saveError(errorLog);
        return ResponseEntity.ok("Log received");
    }
}