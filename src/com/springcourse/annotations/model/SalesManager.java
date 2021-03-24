package com.springcourse.annotations.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("salesManager")
public class SalesManager implements Employee {
	@Autowired
	private FinancialReportBuilder financialReportBuilder;

	@Override
	public String getTasks() {
		return "Manage company's products";
	}
	
	@Override
	public String getReport() {
		return String.join(" ", "Sales Manager", financialReportBuilder.createFinancialReport());
	}
}
