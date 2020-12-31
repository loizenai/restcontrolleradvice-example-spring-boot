package com.loizenai.restcontrolleradvice.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.loizenai.restcontrolleradvice.exception.CustomNotFoundException;
import com.loizenai.restcontrolleradvice.model.ResponseMsg;

@RestControllerAdvice
public class WebRestControllerAdvice {
	
	@ExceptionHandler(CustomNotFoundException.class)
	public ResponseMsg handleNotFoundException(CustomNotFoundException ex) {
		ResponseMsg responseMsg = new ResponseMsg(ex.getMessage());
		return responseMsg;
	}
}