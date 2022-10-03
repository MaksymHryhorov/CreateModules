package serviceimpl;

import model.BankCard;
import model.Subscription;
import model.User;
import service.Service;

import java.util.*;

public class ServiceImpl implements Service {
    private List<User> user = new ArrayList<>();

    @Override
    public void subscribe(BankCard bankCard) {

    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String str) {
        return Optional.empty();
    }

    @Override
    public List<User> getAllUsers() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }
}
