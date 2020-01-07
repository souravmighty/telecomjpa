package com.deloitte.telecom.dto;

import com.deloitte.telecom.entities.CustomerAccount;
import org.springframework.stereotype.Component;

public class SessionData {

    private CustomerAccount user;

    public void setUser(CustomerAccount user){
        this.user=user;
    }

    public CustomerAccount getUser(){
        return user;
    }




}
