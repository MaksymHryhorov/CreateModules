package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DebitBankCard extends BankCard {

    public DebitBankCard(String number, User user) {
        super(number, user);
    }
}
