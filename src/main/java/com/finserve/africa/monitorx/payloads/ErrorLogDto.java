package com.finserve.africa.monitorx.payloads;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Map;

@Getter
@Setter
public class ErrorLogDto {

    private String id;
    private String timestamp;
    private String level;
    private String service;
    private String message;
    private String details;
    private String stack_trace;;
    private Map<String, String> context;

    public ErrorLogDto(String id, String timestamp, String level, String service, String message, String details, String stack_trace, Map<String, String> context) {
        this.id = id;
        this.timestamp = timestamp;
        this.level = level;
        this.service = service;
        this.message = message;
        this.details = details;
        this.stack_trace = stack_trace;
        this.context = context;
    }
}

