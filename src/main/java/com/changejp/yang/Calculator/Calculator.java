package com.changejp.yang.Calculator;

public class Calculator {
	
	private String entering;
	private double savedNumber;
	private boolean numberEntering;
	private String operator;
	private double result;
	
	public Calculator(
			
			String entering, 
			double savedNumber, 
			boolean numberEntering,
			String operator,
			double result
			
			) {
		
		this.entering = entering;
		this.savedNumber = savedNumber;
		this.numberEntering = numberEntering;
		this.operator = operator;
		this.result = result;
	
	}
	
	
	public String getEntering() {
		return entering;
	}


	public void setEntering(String entering) {
		this.entering = entering;
	}


	public double getSavedNumber() {
		return savedNumber;
	}
	public void setSavedNumber(double savedNumber) {
		this.savedNumber = savedNumber;
	}
	public boolean isNumberEntering() {
		return numberEntering;
	}
	public void setNumberEntering(boolean numberEntering) {
		this.numberEntering = numberEntering;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	public double doCalculate() {
		
		this.numberEntering = false;
		
		switch (this.operator) {
		case "+":
			result = result + savedNumber;
			break;
		case "-":
			result = savedNumber - result;
			break;
		case "*":
			result = result * savedNumber;
			break;
		case "/":
			result = savedNumber / result;
			break;
		case "=":
			this.result = result;

		default:
			result = 0;
		}
		
		this.operator = entering;
		
		this.savedNumber = result;
		
		return result;
	}
	

}
