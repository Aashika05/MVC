package com.cg.payroll.responses;

public class CustomerResponse {
	private String response;
	private int statusCode;

	public CustomerResponse() {}

	public CustomerResponse(String response, int statusCode) {
		super();
		this.response = response;
		this.statusCode = statusCode;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
}
