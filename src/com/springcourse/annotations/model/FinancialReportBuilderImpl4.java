package com.springcourse.annotations.model;

import org.springframework.stereotype.Component;

@Component
public class FinancialReportBuilderImpl4 implements FinancialReportBuilder {

	@Override
	public String createFinancialReport() {
		// TODO Auto-generated method stub
		return "Created financial report 4";
	}

}
