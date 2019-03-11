package com.cg.payroll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.payroll.beans.Associate;

@Controller
public class URIController {
	private Associate associate;

	@RequestMapping(value= {"/","index"})
	public String getIndexPage() {
		return "indexPage";
	}
	@RequestMapping("/registration")
	public String getRegistrationPage() {
		return "RegistrationPage";
	}

	@RequestMapping("/findAssociateDetails")
	public String getFindAssociateDetailsPage() {
		return "findAssociateDetailsPage";
	}	

	@RequestMapping("/calculateNetSalary")
	public String getCalculateSalaryPage() {
		return "calculateNetSalaryPage";
	}	
	@RequestMapping("/findAllAssociateDetails")
	public String getallAssociateDetails() {
		return "findAllAssociateDetailsPage";
	}	
	@ModelAttribute
	public Associate getAssociate() {
		associate=new Associate();
		return associate;
	}

}
