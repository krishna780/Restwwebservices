package com.transactional.service;

import com.transactional.model.Account;

public interface BankDao {
    public abstract void withDraw(Account fromAccount,Account toAccount,Double amount);
    public abstract void DepositAmount(Account fromAccount,Account toAccount,Double amount);

}
