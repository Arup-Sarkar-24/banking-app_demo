package com.mycompany.bankingapp.mapper;

import com.mycompany.bankingapp.dto.AccountDto;
import com.mycompany.bankingapp.entity.Account;

public class AccountMapper {

    public static Account mapTOAccount(AccountDto accountDto){
       Account account = new Account(
               accountDto.getId(),
               accountDto.getAccountHolderName(),
               accountDto.getBalance()
       );
       return account;
    }

    public static AccountDto mapTOAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }

}
