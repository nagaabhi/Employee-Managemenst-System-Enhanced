package EmployeeManagementSystem.Exception;

public class InputValidator extends Exception {

    //INPUT VALIDATOR CONSTRUCTOR
    public InputValidator(String inputException){
        super(inputException);

    }

    //THIS METHOD WILL CHECKS THE STATUS OF THE INPUT WHICH IS GIVEN BY THE USER
    public boolean checkDataStatus(String userData){
        return userData == null || userData.equals(" ") || userData.isEmpty();
    }

    //THIS METHOD WILL RETURN THE EXCEPTION RELATED TO THE INPUT TYPE GIVEN BY THE USER
    public String showExceptionStatement(String statement){
          return  statement +  "should not be null or empty";
    }

    //IT WILL CHECK THE STATUS OF THE INPUT GIVEN BY THE USER AND IT WILL THROW THE RESPECTIVE EXCEPTION RELATED TO THAT
    public String validateUserInputs(String userInput) throws InputValidator {
        if(checkDataStatus(userInput)){
            throw new InputValidator(showExceptionStatement(userInput));
        }
        return userInput;
    }


    //IF USER ENTERS THE INPUT IN THE FORM OF NUMBERS(DOUBLE) TYPE) IT WILL THROW THE EXCEPTION IF IT LESSER THE 0.0(LIKE -1, -2, ...)
    public boolean validateUserAmounts(double userAmount){
        return userAmount < 0.0;
    }

    //THIS METHOD WILL SHOW THE EXCEPTION ERROR
    public String showException(double exception){
        return exception + " Invalid Value Entered...";
    }

    //THIS METHOD WILL CHECK THE VALUE WHICH IS ENTERED BY THE USER
    public double validateInputValues(double userInputValues) throws InputValidator {
        if(validateUserAmounts(userInputValues)){
            throw new InputValidator(showException(userInputValues));
        }

        return userInputValues;
    }

}
