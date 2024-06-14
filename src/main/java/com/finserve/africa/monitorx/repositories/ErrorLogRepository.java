package com.finserve.africa.monitorx.repositories;

import com.finserve.africa.monitorx.entities.ErrorLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ErrorLogRepository extends ElasticsearchRepository<ErrorLog, String> {
}