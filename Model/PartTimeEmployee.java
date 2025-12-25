package EmployeeManagementSystem.Model;

public class PartTimeEmployee extends  Employee {

    private double hoursWorked;//HOURS WORKED VALUE
    private double ratePerHour;//RATE PER AMOUNT VALUE



    //SETTING  ALL THE PART TIME EMPLOYEE VALUES THROUGH CONSTRUCTOR
    public PartTimeEmployee(String employeeId, String employeeName, String employeeEmailId,
                            String employeeMobileNumber, String employeeDepartment, String employeeDesignation,
                            String employeeLocation,String dateOfJoining, String employeeStatus,
                            double hoursWorked, double ratePerHour) {
        super(employeeId, employeeName, employeeEmailId, employeeMobileNumber, employeeDepartment, employeeDesignation, employeeLocation, dateOfJoining, employeeStatus);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    //GET HOURS WORKED VALUE
    public double getHoursWorked() {
        return hoursWorked;
    }

    //SET OR UPDATE HOURS WORKED VALUE
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //GET RATE PER HOUR VALUE
    public double getRatePerHour() {
        return ratePerHour;
    }

    //SET OR UPDATE SET PER HOUR VALUE
    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }


    //CALCULATE PART TIME EMPLOYEE SALARY
    @Override
    public double calculateSalary() {
        return hoursWorked * ratePerHour;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "hoursWorked=" + hoursWorked +
                ", ratePerHour=" + ratePerHour +
                '}';
    }
}
