package com.finserve.africa.monitorx.controllers;

import com.finserve.africa.monitorx.entities.ErrorLog;
import com.finserve.africa.monitorx.payloads.ErrorLogDto;
import com.finserve.africa.monitorx.services.ErrorLogServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ErrorLogController {
    private final ErrorLogServiceImpl logService;
    private final SimpMessagingTemplate messagingTemplate;
    public ErrorLogController(ErrorLogServiceImpl logService, SimpMessagingTemplate messagingTemplate) {
        this.logService = logService;
        this.messagingTemplate = messagingTemplate;
    }

    @PostMapping("/error-logs")
    public ResponseEntity<ErrorLogDto> logError(@RequestBody ErrorLogDto errorLogDto) {
        ModelMapper mapper = new ModelMapper();
        ErrorLog errorLog = mapper.map(errorLogDto, ErrorLog.class);
        logService.saveError(errorLog);
        // Send the created ErrorLog to WebSocket subscribers
        messagingTemplate.convertAndSend("/topic/error-logs", errorLogDto);
        return ResponseEntity.ok(errorLogDto);
    }
}