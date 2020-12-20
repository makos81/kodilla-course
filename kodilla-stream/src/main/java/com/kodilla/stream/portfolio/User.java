package com.kodilla.stream.portfolio;

public class User {
    private final String username;
    private final String realName;

    public User(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }

    @Override
    public  boolean equals(Object o){
        if(o==this)
            return true;
        else if (!(o instanceof User)|| o==null){
            return false;
        }
        User user = (User)o;
        return user.getUsername().equals(this.getUsername());
    }
}

