package com.techlabs.model;
import java.time.LocalDate;

public class Insurance {
	
	private int policyNumber;
    private String policyHolderName;
    private double policyAmount;
    private LocalDate policyCreationDate;

    public Insurance(int policyNumber, String policyHolderName, double policyAmount, LocalDate policyCreationDate) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.policyAmount = policyAmount;
        this.policyCreationDate = policyCreationDate;
    }


    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public double getPolicyAmount() {
        return policyAmount;
    }

    public void setPolicyAmount(double policyAmount) {
        this.policyAmount = policyAmount;
    }

    public LocalDate getPolicyCreationDate() {
        return policyCreationDate;
    }

    public void setPolicyCreationDate(LocalDate policyCreationDate) {
        this.policyCreationDate = policyCreationDate;
    }

    @Override
    public String toString() {
        return "InsurancePolicy [policyNumber=" + policyNumber + ", policyHolderName=" + policyHolderName
                + ", policyAmount=" + policyAmount + ", policyCreationDate=" + policyCreationDate + "]";
    }
}
