package EmployeeManagementSystem.Utils;

import EmployeeManagementSystem.Exception.EmployeeException;
import EmployeeManagementSystem.Exception.InputValidator;
import EmployeeManagementSystem.Model.ContractEmployee;
import EmployeeManagementSystem.Model.Employee;
import EmployeeManagementSystem.Model.FullTimeEmployee;
import EmployeeManagementSystem.Model.PartTimeEmployee;

import java.util.Map;
import java.util.Set;

public interface EmployeeFeatures {

    void addEmployees(String employeeType) throws InputValidator;//THIS METHOD WILL ADD THE EMPLOYEES
    void details(Employee employee);//THIS METHOD WILL STORE ALL THE DETAILS ABOUT THE EMPLOYEES
    void displayEmployeeDetails();//THIS METHOD WILL DISPLAY ALL THE DETAILS OF THE EMPLOYEE
    void displaySpecificEmployeeDetails(Employee employee);//THIS METHOD WILL DISPLAY THE DETAILS ABOUT THE SPECIFIC EMPLOYEE
    void displayEmployeeById(String employeeId) throws EmployeeException;//THIS METHOD WILL DISPLAY THE DETAILS ABOUT THE EMPLOYEE BY ID
    void deleteEmployeeById(String employeeId) throws EmployeeException;//THIS METHOD WILL DELETE THE EMPLOYEE FROM THE DATA BASE(HASHMAP) BY ID
    void clearAllEmployees() throws InputValidator;//THIS METHOD WILL CLEARS ALL THE EMPLOYEE DETAILS FROM THE HASHMAP
    void updateEmployeeDetails() throws InputValidator;//
    void updateSpecificEmployeeById(String employeeId);
    void sortEmployeesByName();//THIS METHOD WILL THE SORT THE DATA IN THE ASCENDING ORDER BY NAMES
    void deactivateEmployeeById(String employeeId) throws EmployeeException;//THIS METHOD WILL DEACTIVATE THE EMPLOYEE STATUS
    void activateEmployeeById(String employeeId) throws EmployeeException;//THIS METHOD WILL ACTIVATE THE EMPLOYEE BY ID
    void getEmployeesByStatus(String employeeStatus) throws EmployeeException;//THIS METHOD WILL RETRIVES ALL THE DATA RELATED TO THE STATUS OF THE EMPLOYEE
    void countEmployeesByStatus(String employeeStatus);//THIS METHOD WILL PRINTS THE TOTAL COUNT OF THE EMPLOYEE STATUS





}
