package com.soundcheck.logger;

import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class CustomLoggerImp implements CustomLogger {
    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    @Override
    public void addLog(String msg) {
        LOGGER.info(msg);
    }
}
