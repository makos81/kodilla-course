package com.kodilla.hibernate.manytomany.facade;

public class EmployeeNotFoundException extends Exception{
    public static String EMP_NOT_FOUND = "Employee not found";

    public EmployeeNotFoundException(String message){
        super(message);
    }
}
