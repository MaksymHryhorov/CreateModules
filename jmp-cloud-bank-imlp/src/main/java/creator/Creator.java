package creator;

import model.BankCard;
import model.BankCardType;
import model.User;
import repo.Bank;

import java.time.LocalDate;

public class Creator implements Bank {
    @Override
    public BankCard createBankCard(User user, BankCardType bankCardType) {
        return new BankCard("123123", new User(" ", " ", LocalDate.now()));
    }
}
