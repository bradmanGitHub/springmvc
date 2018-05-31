package com.mkproject.exception;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	private Log logger = LogFactory.getLog(ExceptionController.class);

	@ExceptionHandler(value = Exception.class)  //handle every things.
	public String handleException(HttpServletRequest req, Exception exception) {
		logger.error("Request: " + req.getRequestURL() + " Threw and Exception" + exception, exception);
		return "error";
	}
}