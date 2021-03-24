package com.springcourse.annotations.model;

import org.springframework.stereotype.Component;

@Component("salesManager")
public class SalesManager implements Employee {
	
	private FinancialReportBuilder financialReportBuilder;
	
	public SalesManager(FinancialReportBuilder financialReportBuilder) {
		this.financialReportBuilder = financialReportBuilder;
	}
	
	@Override
	public String getTasks() {
		return "Manage company's products";
	}
	
	@Override
	public String getReport() {
		// return String.join(" ", "Director's", reportBuilder.createReport());
		return "Sales manager reporting";
	}
}
