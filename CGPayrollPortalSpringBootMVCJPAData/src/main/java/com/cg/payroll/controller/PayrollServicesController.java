package com.cg.payroll.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.exceptions.AssociateDetailsNotfoundException;
import com.cg.payroll.services.PayrollServices;

@Controller
public class PayrollServicesController {

	@Autowired
	PayrollServices payrollServices;
	
	@RequestMapping("/registerAssociate")
	public ModelAndView registerAssociate(@Valid@ModelAttribute Associate associate,BindingResult result) {
		if(result.hasErrors()) return new ModelAndView("RegistrationPage");
		associate=payrollServices.acceptAssociateDetails(associate);
		return new ModelAndView("registrationSuccessPage","associate",associate);
	}
	
	@RequestMapping("/findAssociate")
	public ModelAndView fetchAssociateDetails(@RequestParam int associateId) throws AssociateDetailsNotfoundException {
		Associate associate = payrollServices.getAssociateDetails(associateId);
		return new ModelAndView("findAssociateDetailsPage", "associate", associate);
	}
	@RequestMapping("/netSalary")
	public ModelAndView calculateNetSal(@RequestParam int associateId) throws AssociateDetailsNotfoundException {
		double netSalary = payrollServices.calculateNetSalary(associateId);
		return new ModelAndView("calculateNetSalaryPage", "netSalary", netSalary);
	}
	
	@RequestMapping("/associateDetails")
	public ModelAndView allAssociateDetails(@RequestParam int associateId) throws AssociateDetailsNotfoundException {
		List<Associate> associateDetails = payrollServices.getAllAssociatesDetails();
		return new ModelAndView("getAllAssociateDetailsPage", "associateDetails", associateDetails);
	}
}










