package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditBankCard extends BankCard {

    public CreditBankCard(String number, User user) {
        super(number, user);
    }
}

