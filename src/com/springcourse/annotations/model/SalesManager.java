package com.springcourse.annotations.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("salesManager")
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

	@PostConstruct
	private void init() {
		System.out.println("Bean has just been created");
	}
	
	@PreDestroy
	private void destroy() {
		System.out.println("Bean is going to be destroyed");
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
