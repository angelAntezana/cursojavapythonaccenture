package com.biblioteca.util;

import java.util.List;
import java.util.logging.Logger;

public class LoggerUtil {
    
    private static final Logger logger = Logger.getLogger(LoggerUtil.class.getName());

    private static final LoggerUtil INSTANCE = new LoggerUtil();
    // constructor privado
    private LoggerUtil() {
    }

    // punto de acceso global
    public static LoggerUtil getInstance() {
    return INSTANCE;
    }

    public void info(String mensaje) {
        logger.info(mensaje);
    }

    public <T> void info(List<T> list) {
        logger.info(list.toString());
    }

    public void warning(String mensaje) {
        logger.warning(mensaje);
    }

    public void error(String mensaje) {
        logger.severe(mensaje);
    }

}
