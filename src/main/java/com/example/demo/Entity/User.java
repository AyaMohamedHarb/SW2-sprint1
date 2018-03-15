package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class User implements Serializable{
    @Id
    private String email;
    private String userName,password;
    
    private static final long serialVersionUID=1L;
    public User(){}

    public User(String name,String email,String pass)
    {
    	this.userName=name;
        this.email=email;
        this.password=pass;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
