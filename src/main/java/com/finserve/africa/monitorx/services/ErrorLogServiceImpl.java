package com.finserve.africa.monitorx.services;
import com.finserve.africa.monitorx.entities.ErrorLog;
import com.finserve.africa.monitorx.repositories.ErrorLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ErrorLogServiceImpl implements ErrorLogService {


    private final ErrorLogRepository errorLogRepository;

    public ErrorLogServiceImpl(ErrorLogRepository errorLogRepository) {
        this.errorLogRepository = errorLogRepository;
    }

    @Override
    public void saveError(ErrorLog errorLog) {
        errorLogRepository.save(errorLog);
    }
}
