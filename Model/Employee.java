package EmployeeManagementSystem.Model;

public abstract class Employee {

    private String employeeId;//EMPLOYEE ID
    private String employeeName;//EMPLOYEE NAME
    private String employeeEmailId;//EMPLOYEE ID
    private String employeeMobileNumber;//EMPLOYEE MOBILE NUMBER
    private String employeeDepartment;//EMPLOYEE DEPARTMENT
    private String employeeDesignation;//EMPLOYEE DESIGNATION
    private String employeeLocation;//EMPLOYEE LOCATION
    private String dateOfJoining;//EMPLOYEE JOINING DATE
    private String employeeStatus;// EMPLOYEE STATUS

    //SETTING ALL THE EMPLOYEE DETAILS THROUGH CONSTRUCTOR//
    public Employee(String employeeId, String employeeName, String employeeEmailId,
                    String employeeMobileNumber, String employeeDepartment,
                    String employeeDesignation, String employeeLocation,
                    String dateOfJoining, String employeeStatus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmailId = employeeEmailId;
        this.employeeMobileNumber = employeeMobileNumber;
        this.employeeDepartment = employeeDepartment;
        this.employeeDesignation = employeeDesignation;
        this.employeeLocation = employeeLocation;
        this.dateOfJoining = dateOfJoining;
        this.employeeStatus = employeeStatus;
    }

    //GET EMPLOYEE ID
    public String getEmployeeId() {
        return employeeId;
    }

    //SET EMPLOYEE ID OR UPDATE THE EMPLOYEE ID
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    //GET EMPLOYEE NAME
    public String getEmployeeName() {
        return employeeName;
    }

    //SET EMPLOYEE NAME OR UPDATE THE EMPLOYEE NAME
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    //GET EMPLOYEE EMAIL
    public String getEmployeeEmailId() {
        return employeeEmailId;
    }

    //SET EMPLOYEE EMIL OR UPDATE THE EMPLOYEE EMIL
    public void setEmployeeEmailId(String employeeEmailId) {
        this.employeeEmailId = employeeEmailId;
    }

    //GET EMPLOYEE MOBILE NUMBER
    public String getEmployeeMobileNumber() {
        return employeeMobileNumber;
    }

    //SET EMPLOYEE MOBILE NUMBER OR UPDATE THE EMPLOYEE MOBILE NUMBER
    public void setEmployeeMobileNumber(String employeeMobileNumber) {
        this.employeeMobileNumber = employeeMobileNumber;
    }

    //GET THE EMPLOYEE DEPARTMENT
    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    //SET THE EMPLOYEE DEPARTMENT OR UPDATE THE EMPLOYEE DEPARTMENT
    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    //GET THE EMPLOYEE DESIGNATION
    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    //SET THE EMPLOYEE DESIGNATION OR UPDATE THE EMPLOYEE DESIGNATION
    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    //GET THE EMPLOYEE LOCATION
    public String getEmployeeLocation() {
        return employeeLocation;
    }

    //SET THE EMPLOYEE LOCATION OR UPDATE THE EMPLOYEE LOCATION
    public void setEmployeeLocation(String employeeLocation) {
        this.employeeLocation = employeeLocation;
    }

    //GET THE EMPLOYEE DATE OF JOINING
    public String getDateOfJoining() {
        return dateOfJoining;
    }

    //SET THE EMPLOYEE JOINING DATE OR UPDATE THE EMPLOYEE JOINING DATE
    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    //GET THE EMPLOYEE STATUS
    public String getEmployeeStatus() {
        return employeeStatus;
    }

    //SET THE EMPLOYEE STATUS OR UPDATE THE EMPLOYEE STATUS
    public  void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    //CALCULATE THE EMPLOYEE SALARY
    public abstract double calculateSalary();


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeEmailId='" + employeeEmailId + '\'' +
                ", employeeMobileNumber='" + employeeMobileNumber + '\'' +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                ", employeeLocation='" + employeeLocation + '\'' +
                ", dateOfJoining='" + dateOfJoining + '\'' +
                ", employeeStatus='" + employeeStatus + '\'' +
                '}';
    }
}
