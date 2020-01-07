package com.deloitte.telecom.service;

import com.deloitte.telecom.dao.ICustomerAccountDao;
import com.deloitte.telecom.entities.CustomerAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class CustomerAccountService implements ICustomerAccountService {

    private ICustomerAccountDao userDao;

    public ICustomerAccountDao getUserDao() {
        return userDao;
    }

    @Autowired
    public void setUserDao(ICustomerAccountDao dao) {
        this.userDao = dao;
    }

    @Override
    public boolean credentialsCorrect(String mobileNo, String password) {
        return userDao.credentialsCorrect(mobileNo, password);
    }

    @Override
    public CustomerAccount findUserByMobileNo(String mobileNo) {
        return userDao.findUserByMobileNo(mobileNo);
    }

    @Override
    public CustomerAccount save(CustomerAccount user) {
        return getUserDao().save(user);
    }

    /*
    @PostConstruct
    public void init(){
       CustomerAccount user1=new CustomerAccount("satya","satya");
       userDao.save(user1);
       CustomerAccount user2=new CustomerAccount("pranav","pranav");
       userDao.save(user2);
    }*/
}
