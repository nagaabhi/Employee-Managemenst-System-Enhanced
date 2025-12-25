package EmployeeManagementSystem.App;

import EmployeeManagementSystem.Exception.EmployeeException;
import EmployeeManagementSystem.Exception.InputValidator;
import EmployeeManagementSystem.Service.ManageEmployees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws EmployeeException {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("==== Employee Management System =====");
        ManageEmployees manageEmployees;
        manageEmployees = new ManageEmployees();

        boolean start = true;
        while (start){

            System.out.print("Enter Your Option: ");//ENTER THE USER OPTION FOR PERFORMING THE SEPCIFIED OPERATIONS
            int userOption = scanner.nextInt();
            scanner.nextLine();

            switch (userOption){
                //ADDING THE EMPLOYEES
                case 1 -> {
                    System.out.print("Enter The Type Of Employee: ");
                    String employeeType = scanner.nextLine();
                    try{
                        manageEmployees.addEmployees(employeeType);
                    }catch (InputValidator e){
                        System.out.println(e.getMessage());
                    }

                }
                //DISPLAY THE DETAILS OF THE EMPLOYEES
                case 2 -> {
                    manageEmployees.displayEmployeeDetails();
                }
                //DISPLAY THE EMPLOYEE DETAILS BY ID
                case 3 -> {
                    System.out.print("Enter The Employee Id: ");
                    String employeeId = scanner.nextLine();

                    try{
                        manageEmployees.displayEmployeeById(employeeId);
                    }catch (EmployeeException e){
                        System.out.println(e.getMessage());
                    }


                }
                //SORT THE EMPLOYES BASED ON NAMES
                case 4 -> {
                    manageEmployees.sortEmployeesByName();
                }
                //DELETE THE EMPLOYEES BY ID
                case 5 -> {
                    System.out.print("Enter The Employee Id: ");
                    String employeeId = scanner.nextLine();

                    try{
                        manageEmployees.deleteEmployeeById(employeeId);
                    }catch (EmployeeException e){
                        System.out.println(e.getMessage());
                    }

                }
                //CLEAR ALL THE EMPLOYEES FROM THE DATA BASE (HASH MAP)
                case 6 -> {
                    try {
                        manageEmployees.clearAllEmployees();
                    }catch (InputValidator e){
                        System.out.println(e.getMessage());
                    }
                }
                //DEACTIVATE THE EMPLOYEES
                case 7 -> {
                    System.out.println("Enter The Employee Id: ");
                    String employeeId = scanner.nextLine();
                    try {
                        manageEmployees.deactivateEmployeeById(employeeId);
                    } catch (EmployeeException e) {
                        System.out.println(e.getMessage());
                    }
                }
                //GET THE EMPLOYEE DETAILS BASED UP ON THE STATUS
                case 8 -> {
                    System.out.println("Enter The Status Type (active, inactive): ");
                    System.out.println("Employee Status");
                    String employeeStatus = scanner.nextLine();

                    manageEmployees.getEmployeesByStatus(employeeStatus);
                }
                //ACTIVE THE EMPLOYEES BASED UP ON THE ID
                case 9 -> {
                    System.out.println("Active Employee: ");
                    System.out.println("Employee Id:");
                    String employeeId = scanner.nextLine();
                    manageEmployees.activateEmployeeById(employeeId);
                }
                //COUNT THE TOTAL NUMBER OF EMPLOYEES BASED UP ON THE STATUS
                case 10 -> {
                    System.out.println("Enter The Status Type (active, inactive): ");
                    System.out.println("Employee Status");
                    String employeeStatus = scanner.nextLine();

                    manageEmployees.countEmployeesByStatus(employeeStatus);
                }
                // STILL MORE FEATURES ARE GOING TO ADD...
                case 15 -> {
                    start = false;
                }
            }
        }
    }
}
