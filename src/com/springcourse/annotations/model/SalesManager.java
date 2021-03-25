package com.springcourse.annotations.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("salesManager")
@Scope("prototype")
public class SalesManager implements Employee {
	private FinancialReportBuilder financialReportBuilder;
	
	public FinancialReportBuilder getFinancialReportBuilder() {
		return financialReportBuilder;
	}

	@Autowired
	@Qualifier("financialReportBuilderImpl4")
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
