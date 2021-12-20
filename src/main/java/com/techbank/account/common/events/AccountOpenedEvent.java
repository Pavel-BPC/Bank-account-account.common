package com.techbank.account.common.events;

import com.techbank.account.common.dto.AccountType;
import com.techbank.cqrs.core.commands.BaseCommand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class AccountOpenedEvent extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private Date createDate;
    private double openingBalance;

}
