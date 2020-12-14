package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    private String firstname;
    private String lastname;
    private String peselId;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPeselId() {
        return peselId;
    }

    public void setPeselId(String peselId) {
        this.peselId = peselId;
    }

    public LibraryUser(String firstname, String lastname, String peselId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peselId = peselId;
    }

    @Override
    public int hashCode(){
        return Objects.hash(firstname, lastname, peselId);
    }

    @Override
    public boolean equals(Object o){
        if(o==this)
            return true;
        if(o==null || o.getClass()!=this.getClass())
            return false;
        LibraryUser libraryUser = (LibraryUser)o;
        return(libraryUser.getFirstname().equals(this.getFirstname()) && libraryUser.getLastname().equals(this.getLastname())
        && libraryUser.getPeselId().equals(this.getPeselId()));
    }
}
