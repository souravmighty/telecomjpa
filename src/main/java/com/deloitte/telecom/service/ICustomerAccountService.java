package com.deloitte.telecom.service;

import com.deloitte.telecom.entities.AppUser;
import com.deloitte.telecom.entities.CustomerAccount;

public interface ICustomerAccountService {
	boolean credentialsCorrect(String mobileNo, String password);

    CustomerAccount save(CustomerAccount user);

	CustomerAccount findUserByMobileNo(String mobileNo);
}
