package com.deloitte.telecom.dao;

import com.deloitte.telecom.entities.CustomerAccount;

public interface ICustomerAccountDao {
    boolean credentialsCorrect(String mobileNo, String password);

    CustomerAccount save(CustomerAccount user);

	CustomerAccount findUserByMobileNo(String mobileNo);
}
