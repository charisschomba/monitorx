package com.finserve.africa.monitorx.services;

import com.finserve.africa.monitorx.entities.ErrorLog;

public interface ErrorLogService {
    ErrorLog saveError(ErrorLog errorLog);
}
