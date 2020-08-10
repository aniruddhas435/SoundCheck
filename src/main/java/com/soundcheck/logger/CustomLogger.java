package com.soundcheck.logger;

import org.springframework.stereotype.Service;

@Service
public interface CustomLogger {
    void addLog(String msg);
}
