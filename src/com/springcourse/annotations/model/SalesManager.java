package com.springcourse.annotations.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("salesManager")
public class SalesManager implements Employee {
	private FinancialReportBuilder financialReportBuilder;
	
	public FinancialReportBuilder getFinancialReportBuilder() {
		return financialReportBuilder;
	}

	@Autowired
	public void setFinancialReportBuilder(FinancialReportBuilder financialReportBuilder) {
		this.financialReportBuilder = financialReportBuilder;
	}

	@Override
	public String getTasks() {
		return "Manage company's products";
	}
	
	@Override
	public String getReport() {
		return String.join(" ", "Sales Manager", financialReportBuilder.createFinancialReport());
	}
}
