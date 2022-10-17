package creator;

import model.BankCard;
import model.BankCardType;
import model.User;
import repo.Bank;

public class Creator implements Bank {
    @Override
    public BankCard createBankCard(User user, BankCardType bankCardType) {

        return new BankCard(bankCardType.name(), user);
    }
}
