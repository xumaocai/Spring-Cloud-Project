package com.umeox.sc.rest.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  You can pick up any unhandled exceptions here.
 */
@ControllerAdvice
public class GlobalControllerExceptionHandler {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

  
    @ExceptionHandler(RuntimeException.class)  
    @ResponseBody  
    public String handleUnexpectedServerError(RuntimeException ex) {
    	//TODO 短信或邮件提醒admin
    	log.error(ex.getMessage(),ex);
    	return "status";
    }


    
}
