package EmployeeManagementSystem.Model;

import java.util.Date;

public class ContractEmployee extends Employee{

    private double contractAmount;//CONTRACT AMOUNT VALUE
    private String monthlyStartDate;//MONTHLY START DATE VALUE
    private String monthlyEndDate;//MONTHLY END DATE VALUE

    //SETTING ALL THE CONTRACT EMPLOYEE VALUES THROUGH CONSTRUCTOR
    public ContractEmployee(String employeeId, String employeeName, String employeeEmailId,
                            String employeeMobileNumber, String employeeDepartment, String employeeDesignation,
                            String employeeLocation, String dateOfJoining, String employeeStatus,
                            double contractAmount, String monthlyStartDate, String monthlyEndDate) {
        super(employeeId, employeeName, employeeEmailId, employeeMobileNumber, employeeDepartment, employeeDesignation, employeeLocation, dateOfJoining, employeeStatus);
        this.contractAmount = contractAmount;
        this.monthlyStartDate = monthlyStartDate;
        this.monthlyEndDate = monthlyEndDate;
    }

    //GET THE CONTRACT AMOUNT
    public double getContractAmount() {
        return contractAmount;
    }


    //SET OR UPDATE THE CONTRACT AMOUNT
    public void setContractAmount(double contractAmount) {
        this.contractAmount = contractAmount;
    }

    //GET TGE MONTHLY START DATE VALUE
    public String getMonthlyStartDate() {
        return monthlyStartDate;
    }

    //SET THE MONTHLY START DATE VALUE
    public void setMonthlyStartDate(String monthlyStartDate) {
        this.monthlyStartDate = monthlyStartDate;
    }

    //GET THE MONTHLY END DATE VALUE
    public String getMonthlyEndDate() {
        return monthlyEndDate;
    }

    //SET OR UPDATE THE MONTHLY END DATE VALUE
    public void setMonthlyEndDate(String monthlyEndDate) {
        this.monthlyEndDate = monthlyEndDate;
    }


    //CALCULATE THE CONTRACT AMOUNT SALARY
    @Override
    public double calculateSalary() {

        return contractAmount;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "contractAmount=" + contractAmount +
                ", monthlyStartDate=" + monthlyStartDate +
                ", monthlyEndDate=" + monthlyEndDate +
                '}';
    }
}
