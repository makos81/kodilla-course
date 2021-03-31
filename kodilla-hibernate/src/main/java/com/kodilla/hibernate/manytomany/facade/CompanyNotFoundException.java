package com.kodilla.hibernate.manytomany.facade;

public class CompanyNotFoundException extends Exception{
        public static String COMPANY_NOT_FOUND = "Company not found";

        public CompanyNotFoundException(String message){
            super(message);
        }
}
