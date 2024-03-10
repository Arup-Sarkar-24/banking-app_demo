package com.mycompany.bankingapp.dto;

import lombok.*;
@Data
@AllArgsConstructor
public class AccountDto {

    private Long id;

    private  String accountHolderName;

    private double balance;
}
