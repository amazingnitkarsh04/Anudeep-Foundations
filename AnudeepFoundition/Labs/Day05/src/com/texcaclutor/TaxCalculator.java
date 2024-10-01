package com.texcaclutor;


	public class TaxCalculator {

	    // Custom exception class for invalid country
	    public static class CountryNotValidException extends Exception {
	        public CountryNotValidException(String message) {
	            super(message);
	        }
	    }

	    // Custom exception class for invalid employee name
	    public static class EmployeeNameInvalidException extends Exception {
	        public EmployeeNameInvalidException(String message) {
	            super(message);
	        }
	    }

	    // Custom exception class for tax ineligibility
	    public static class TaxNotEligibleException extends Exception {
	        public TaxNotEligibleException(String message) {
	            super(message);
	        }
	    }

	    // Method to calculate tax
	    public double calculateTax(String empName, boolean isIndian, double empSal) 
	            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {

	        // Check if employee is Indian
	        if (!isIndian) {
	            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
	        }

	        // Check if employee name is null or empty
	        if (empName == null || empName.isEmpty()) {
	            throw new EmployeeNameInvalidException("The employee name cannot be empty.");
	        }

	        // Tax calculation logic based on employee salary
	        double taxAmount = 0;

	        if (empSal > 100000) {
	            taxAmount = empSal * 8 / 100;
	        } else if (empSal >= 50000 && empSal <= 100000) {
	            taxAmount = empSal * 6 / 100;
	        } else if (empSal >= 30000 && empSal < 50000) {
	            taxAmount = empSal * 5 / 100;
	        } else if (empSal >= 10000 && empSal < 30000) {
	            taxAmount = empSal * 4 / 100;
	        } else {
	            throw new TaxNotEligibleException("The employee does not need to pay tax.");
	        }

	        return taxAmount;
	    }

	    public static void main(String[] args) {
	        // Create an object of TaxCalculator
	        TaxCalculator calculator = new TaxCalculator();

	        // Test case 1: Ron, salary 34000, not Indian
	        try {
	            double tax = calculator.calculateTax("Ron", false, 34000);
	            System.out.println("Tax amount is " + tax);
	        } catch (CountryNotValidException e) {
	            System.out.println(e.getMessage());
	        } catch (EmployeeNameInvalidException e) {
	            System.out.println(e.getMessage());
	        } catch (TaxNotEligibleException e) {
	            System.out.println(e.getMessage());
	        }

	        // Test case 2: Tim, salary 1000, is Indian
	        try {
	            double tax = calculator.calculateTax("Tim", true, 1000);
	            System.out.println("Tax amount is " + tax);
	        } catch (CountryNotValidException e) {
	            System.out.println(e.getMessage());
	        } catch (EmployeeNameInvalidException e) {
	            System.out.println(e.getMessage());
	        } catch (TaxNotEligibleException e) {
	            System.out.println(e.getMessage());
	        }

	        // Test case 3: Jack, salary 55000, is Indian
	        try {
	            double tax = calculator.calculateTax("Jack", true, 55000);
	            System.out.println("Tax amount is " + tax);
	        } catch (CountryNotValidException e) {
	            System.out.println(e.getMessage());
	        } catch (EmployeeNameInvalidException e) {
	            System.out.println(e.getMessage());
	        } catch (TaxNotEligibleException e) {
	            System.out.println(e.getMessage());
	        }

	        // Test case 4: Empty name, salary 30000, is Indian
	        try {
	            double tax = calculator.calculateTax("", true, 30000);
	            System.out.println("Tax amount is " + tax);
	        } catch (CountryNotValidException e) {
	            System.out.println(e.getMessage());
	        } catch (EmployeeNameInvalidException e) {
	            System.out.println(e.getMessage());
	        } catch (TaxNotEligibleException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}



