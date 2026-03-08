package com.moonstone.accounts.service;

import com.moonstone.accounts.dto.CustomerDto;
import org.springframework.stereotype.Service;

/**
 *
 * @Param customerDto CustomerDto Object
 */
public interface IAccountsService {
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
