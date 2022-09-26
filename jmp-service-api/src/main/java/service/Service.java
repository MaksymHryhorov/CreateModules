package service;

import model.BankCard;
import model.Subscription;
import model.User;

import java.util.List;
import java.util.Optional;

public interface Service {
    void subscribe(BankCard bankCard);
    Optional<Subscription> getSubscriptionByBankCardNumber(String str);
    List<User> getAllUsers();
}
