package EmployeeManagementSystem.Service;

import EmployeeManagementSystem.Exception.EmployeeException;
import EmployeeManagementSystem.Exception.InputValidator;
import EmployeeManagementSystem.Model.ContractEmployee;
import EmployeeManagementSystem.Model.Employee;
import EmployeeManagementSystem.Model.FullTimeEmployee;
import EmployeeManagementSystem.Model.PartTimeEmployee;
import EmployeeManagementSystem.Utils.EmployeeFeatures;
import EmployeeManagementSystem.Utils.EmployeeType;
import java.util.*;

public class ManageEmployees implements EmployeeFeatures {

    Employee employee;//CREATING EMPLOYEE CLASS REFERENCE VARIABLE
    HashMap<String, Employee> manageEmployees;//CREATING THE EMPLOYEE HASH MAP REFERENCE VARIABLE
    Scanner scanner;//CREATING THE SCANNER REFERENCE VARIABLE
    EmployeeType employeeType;//CREATING THE ENUM REFERENCE VARIABLE
    InputValidator inputValidator;//CREATING THE INPUT VALIDATOR REFERENCE VARIABLE

    //CONSTRUCTOR FOR THE MANAGE EMPLOYEES FOR INITILIZING ALL THE ABOVE  REFERENCE VARIABLES
    public ManageEmployees(){
        manageEmployees = new LinkedHashMap<>();
        scanner = new Scanner(System.in);
        inputValidator = new InputValidator("");
    }

    public Set<Map.Entry<String, Employee>> employees(){
        return manageEmployees.entrySet();
    }

    //ADD EMPLOYEES
    @Override
    public void addEmployees(String employeeType) throws InputValidator {

        System.out.print("Enter The Employee Id: ");
        String employeeId = inputValidator.validateUserInputs(scanner.nextLine());

        System.out.print("Enter The Employee Name: ");
        String employeeName = inputValidator.validateUserInputs(scanner.nextLine());

        System.out.print("Enter The Email Id: ");
        String emailId = inputValidator.validateUserInputs(scanner.nextLine());

        System.out.print("Enter The Employee Mobile Number: ");
        String mobNum = inputValidator.validateUserInputs(scanner.nextLine());

        System.out.print("Enter The Employee Department: ");
        String employeeDepartment = inputValidator.validateUserInputs(scanner.nextLine());

        System.out.print("Enter The Designation: ");
        String employeeDesignation = inputValidator.validateUserInputs(scanner.nextLine());


        System.out.print("Enter The Location: ");
        String location = inputValidator.validateUserInputs(scanner.nextLine());


        System.out.print("Enter The Date Of Joining: ");
        String dateOfJoining = inputValidator.validateUserInputs(scanner.nextLine());

        System.out.print("Enter The Employee Status: ");
        String employeeStatus = inputValidator.validateUserInputs(scanner.nextLine());

        switch (employeeType){

            case "FullTime", "Fulltime", "fulltime" -> {

                System.out.print("Enter The Basic Salary: ");
                double basicSalary = inputValidator.validateInputValues(scanner.nextDouble());
                scanner.nextLine();

                System.out.print("Enter The hra Salary: ");
                double hraSalary = inputValidator.validateInputValues(scanner.nextDouble());
                scanner.nextLine();

                System.out.print("Enter The Bonus Salary: ");
                double bonusSalary = inputValidator.validateInputValues(scanner.nextDouble());
                scanner.nextLine();

                System.out.print("Enter The Tax To Pay Amount: ");
                double taxToPay = inputValidator.validateInputValues(scanner.nextDouble());
                scanner.nextLine();

                System.out.print("Enter The Provident Fund: ");
                double providentFund = inputValidator.validateInputValues(scanner.nextDouble());
                scanner.nextLine();

                employee = new FullTimeEmployee(employeeId, employeeName, emailId, mobNum, employeeDepartment,
                        employeeDesignation, location, dateOfJoining,employeeStatus,basicSalary,
                        hraSalary, bonusSalary, taxToPay, providentFund);

                manageEmployees.put(employeeId, employee);



            }

            case "Parttime", "PartTime", "parttime" -> {

                System.out.print("Enter The Hours Worked: ");
                double hoursWorked = inputValidator.validateInputValues(scanner.nextDouble());
                scanner.nextLine();

                System.out.print("Enter The Rate Per Hour: ");
                double ratePerHour = inputValidator.validateInputValues(scanner.nextDouble());
                scanner.nextLine();

                employee = new PartTimeEmployee(employeeId, employeeName, emailId, mobNum, employeeDepartment,
                        employeeDesignation, location, dateOfJoining,employeeStatus,hoursWorked, ratePerHour);

                manageEmployees.put(employeeId, employee);

            }

            case "contract", "Contract" -> {

                System.out.print("Enter The Contract Amount: ");
                double contractAmount = inputValidator.validateInputValues(scanner.nextDouble());
                scanner.nextLine();

                System.out.print("Enter The Start Date (yyyy-mm-dd): ");
                String startDate = inputValidator.validateUserInputs(scanner.nextLine());
                scanner.nextLine();
//
//                LocalDate monthlyStartDate = LocalDate.parse(startDate);

                System.out.print("Enter The End Date  (yyyy-mm-dd): ");
                String endDate = inputValidator.validateUserInputs(scanner.nextLine());
                scanner.nextLine();

//                LocalDate monthlyEndDate = LocalDate.parse(endDate);

                employee = new ContractEmployee(employeeId, employeeName, emailId, mobNum, employeeDepartment,
                        employeeDesignation, location, dateOfJoining,employeeStatus, contractAmount, startDate, endDate);

                manageEmployees.put(employeeId, employee);
            }
        }

    }

    //STORE ALL THE DETAILS RELATED TO THE EMPLOYEES
    public void details(Employee employee){

        System.out.println("Employee Id: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Email: " + employee.getEmployeeEmailId());
        System.out.println("Employee Mob Num:" + employee.getEmployeeMobileNumber());
        System.out.println("Employee Department: " + employee.getEmployeeDepartment());
        System.out.println("Employee Designation: " + employee.getEmployeeDesignation());
        System.out.println("Employee Location: " + employee.getEmployeeLocation());
        System.out.println("Employee Date Of Joining: " + employee.getDateOfJoining());
        System.out.println("Employee Status: " + employee.getEmployeeStatus());

    }

    //DISPLAY ALL THE EMPLOYEE DETAILS
    public void displayEmployeeDetails(){
        employees().forEach((employee) -> {
            details(employee.getValue());
        });
    }

    //ITERATOR FOR THE MANAGE EMPLOYEES HASH MAP
    public Iterator<Map.Entry<String, Employee>> employeeIterator(){
        return employees().iterator();
    }

    //DISPLAY THE DETAILS FOR THE SPECIFIC EMPLOYEE...
    @Override
    public void displaySpecificEmployeeDetails(Employee employee) {

        if(employee instanceof  FullTimeEmployee){
            System.out.println("Full Time Employee -> ");
            FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
            System.out.println("Basic Salary: " + fullTimeEmployee.getBasicSalary());
            System.out.println("Hra Salary: " + fullTimeEmployee.getHraSalary());
            System.out.println("Bonus Salary: " + fullTimeEmployee.getBonusSalary());
            System.out.println("Tax To Pay: " + fullTimeEmployee.getTaxToPay());
            System.out.println("Provident Fund: " + fullTimeEmployee.getProvidentFund());
            System.out.println("Total Salary: "+ fullTimeEmployee.calculateSalary());
            System.out.println("-----");
            return;
        }
        if(employee instanceof  PartTimeEmployee){
            System.out.println("Part Time Employee: ");
            PartTimeEmployee partTimeEmployee = (PartTimeEmployee) employee;
            System.out.println("Hours Worked: " + partTimeEmployee.getHoursWorked());
            System.out.println("Rate Per Hour: " + partTimeEmployee.getRatePerHour());
            System.out.println("Salary: " + partTimeEmployee.calculateSalary());
            return;
        }
        if(employee instanceof  ContractEmployee){
            System.out.println("Contract Employee: ");
            ContractEmployee contractEmployee = (ContractEmployee) employee;
            System.out.println("Contract Amount: " + contractEmployee.getContractAmount());
            System.out.println("Month Start Date: " + contractEmployee.getMonthlyStartDate());
            System.out.println("Month End Date: " + contractEmployee.getMonthlyEndDate());
        }
    }

    //DISPLAY THE DETAILS OF THE EMPLOYEE ID
    @Override
    public void displayEmployeeById(String employeeId) throws EmployeeException {


        if(!manageEmployees.containsKey(employeeId)){
            System.out.println("Not found...");

        }else{
            Employee employee = manageEmployees.get(employeeId);
            details(employee);
            displaySpecificEmployeeDetails(employee);
            return;


        }
    }

    //DELETE THE EMPLOYEE BY ID
    @Override
    public void deleteEmployeeById(String employeeId) throws EmployeeException {


       if(!manageEmployees.containsKey(employeeId)){
           throw new EmployeeException("No Employee Found with the id:" + employeeId);

       }
       manageEmployees.remove(employeeId);

    }

    //CLEAR ALL THE EMPLOYEES FROM THE DATA BASE (HASH MAP)
    @Override
    public void clearAllEmployees() throws InputValidator {

        System.out.print("Are you sure you want to clear the employee database...");
        String userRes = inputValidator.validateUserInputs(scanner.nextLine());

        switch (userRes){
            case "yes", "Yes" -> {
                manageEmployees.clear();
                displayEmployeeDetails();
            }
            case "no", "No" ->{
                displayEmployeeDetails();
            }
        }



    }

    //UPDATE THE EMPLOYEE DETAILS
    @Override
    public void updateEmployeeDetails() throws InputValidator {

        System.out.println("Enter The Section to update: ");
        String userSection = inputValidator.validateUserInputs(scanner.nextLine());

        switch (userSection){
            case "name", "Name" -> {
                System.out.println("Reenter the user Name: ");
                String userName = inputValidator.validateUserInputs(scanner.nextLine());
                employee.setEmployeeName(userName);
            }
        }

    }

    //UPDATE THE SPECIFIC EMPLOYEE DETAILS BY ID(STILL ON PROCESS)
    @Override
    public void updateSpecificEmployeeById(String employeeId) {

    }

    //SORT THE EMPLOYEES BY NAME FROM A -> D OR D -> A
    @Override
    public void sortEmployeesByName() {
     employees().stream().
             sorted((a, b) -> a.getValue().getEmployeeName().compareToIgnoreCase(b.getValue().getEmployeeName())).
             forEach((employee) -> {
                 details(employee.getValue());
                 displaySpecificEmployeeDetails(employee.getValue());

     });
    }


    //DEACTIVATE THE EMPLOYEE BY EMPLOYEE ACTIVE -> INACTIVE
    @Override
    public void deactivateEmployeeById(String employeeId) throws EmployeeException {

        if(!manageEmployees.containsKey(employeeId)){
            throw new EmployeeException("Employee Not found with id: " + employeeId);
        }else{
            Employee deactivateEmployee = manageEmployees.get(employeeId);
            if(deactivateEmployee.getEmployeeStatus().equals("inactive")){
                throw new EmployeeException("Employee Already Inactive");
            }else{
                deactivateEmployee.setEmployeeStatus("inactive");
                details(deactivateEmployee);
                return;
            }

        }
    }

    //ACTIVATE THE EMPLOYEE BY ID INACTIVE -> DEACTIVATE
    @Override
    public void activateEmployeeById(String employeeId) throws EmployeeException{

        if(!manageEmployees.containsKey(employeeId)){
            throw new EmployeeException("Employee Not found with id: " + employeeId);
        }else{

            Employee activateEmployee = manageEmployees.get(employeeId);
            if(activateEmployee.getEmployeeStatus().equals("active")){
                throw new EmployeeException("Employee Already active");
            }else{
                activateEmployee.setEmployeeStatus("activate");
                details(activateEmployee);
                return;
            }
        }
    }

    //GET THE EMPLOYEES BY STATUS ACTIVE OR INACTIVE
    @Override
    public void getEmployeesByStatus(String employeeStatus) throws EmployeeException {

         employees().forEach((employee) -> {
             if(employee.getValue().getEmployeeStatus().equals(employeeStatus)){
                 details(employee.getValue());
                 return;
             }
             System.out.println("Employee Not Found...");

         });
    }

    //COUNT TOTAL NUMBER OF EMPLOYEES BY STATUS
    @Override
    public void countEmployeesByStatus(String employeeStatus) {
        long totalEmployeesByStatus = employees().stream().filter((employee) -> employee.getValue().getEmployeeStatus().equals(employeeStatus)).count();
        System.out.println("Total Employees With " + employeeStatus +  "-> " + totalEmployeesByStatus);
    }


}
