package EmployeeManagementSystem.Model;

public class FullTimeEmployee extends Employee {

    private double basicSalary;//EMPLOYEE BASIC SALARY VALUE
    private double hraSalary;//EMPLOYEE HRA SALARY
    private double bonusSalary;//EMPLOYEE BONUS SALARY
    private double taxToPay;//EMPLOYEE TAC TO PAY AMOUNT
    private double providentFund;//EMPLOYEE PROVIDENT AMOUNT


    //SETTING ALL THE FULL TIME EMPLOYEE DETAILS THROUGH CONSTRUCTOR
    public FullTimeEmployee(String employeeId, String employeeName, String employeeEmailId, String employeeMobileNumber,
                            String employeeDepartment, String employeeDesignation, String employeeLocation,String dateOfJoining, String employeeStatus,
                            double basicSalary, double hraSalary, double bonusSalary, double taxToPay, double providentFund) {
        super(employeeId, employeeName, employeeEmailId, employeeMobileNumber, employeeDepartment, employeeDesignation, employeeLocation, dateOfJoining, employeeStatus);
        this.basicSalary = basicSalary;
        this.hraSalary = hraSalary;
        this.bonusSalary = bonusSalary;
        this.taxToPay = taxToPay;
        this.providentFund = providentFund;
    }

    //GET EMPLOYEE BASIC SALARY
    public double getBasicSalary() {
        return basicSalary;
    }


    //GET THE HRA SALARY
    public double getHraSalary() {
        return hraSalary;
    }

    //GET THE EMPLOYEE BONUS SALARY
    public double getBonusSalary() {
        return bonusSalary;
    }


    //GET THE TAX TO PAY AMOUNT
    public double getTaxToPay() {
        return taxToPay;
    }

    //SET OR UPDATE THE PROVIDENT FUND
    public double getProvidentFund() {
        return providentFund;
    }

    //SET OR UPDATE THE BASIC SALARY
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    //SET OR UPDATE THE HRA SALARY
    public void setHraSalary(double hraSalary) {
        this.hraSalary = hraSalary;
    }

    //SET OR UPDATE THE BONUS SALARY
    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    //SET OR UPDATE THE TAX TO PAY AMOUNT
    public void setTaxToPay(double taxToPay) {
        this.taxToPay = taxToPay;
    }

    //SET OR UPDATE THE PROVIDENT FUND
    public void setProvidentFund(double providentFund) {
        this.providentFund = providentFund;
    }

    //CALCULATE FULL TIME EMPLOYEE SALARY
    @Override
    public double calculateSalary() {
        return basicSalary + bonusSalary + hraSalary - (taxToPay + providentFund);
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "basicSalary=" + basicSalary +
                ", hraSalary=" + hraSalary +
                ", bonusSalary=" + bonusSalary +
                ", taxToPay=" + taxToPay +
                ", providentFund=" + providentFund +
                '}';
    }
}
