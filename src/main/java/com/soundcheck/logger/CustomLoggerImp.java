package com.soundcheck.logger;

import java.util.logging.Logger;

public class CustomLoggerImp implements CustomLogger {
    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    @Override
    public void addLog(String msg) {
        LOGGER.info(msg);
    }
}
