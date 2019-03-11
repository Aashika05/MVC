package com.cg.payroll.aspect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.cg.payroll.exceptions.AssociateDetailsNotfoundException;

@ControllerAdvice
public class PayrollExceptionAspect {

	@ExceptionHandler(AssociateDetailsNotfoundException.class)
	public ModelAndView handelAssociateDetailsNotFoundException(Exception e) {
		return new ModelAndView("findAssociateDetailsPage","errorMessage",e.getMessage());
	}
}
