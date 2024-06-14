package com.finserve.africa.monitorx.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.time.LocalDateTime;
import java.util.Map;

@Getter
@Setter
@Document(indexName = "error_log")
public class ErrorLog {
    @Id
    private String id;
    private String timestamp;
    private String level;
    private String service;
    private String message;
    private String details;
    private String stack_trace;
    private Map<String, String> context;

}
