package com.biblioteca.util;

import java.util.logging.Logger;

public class LoggerUtil {
    
    private static final Logger logger = Logger.getLogger(LoggerUtil.class.getName());

    public void info(String mensaje) {
        logger.info(mensaje);
    }

    public void warning(String mensaje) {
        logger.warning(mensaje);
    }

    public void error(String mensaje) {
        logger.severe(mensaje);
    }

}
