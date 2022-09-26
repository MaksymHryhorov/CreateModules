package serviceimpl;

import model.BankCard;
import model.Subscription;
import model.User;
import service.Service;

import java.util.List;
import java.util.Optional;

public class ServiceImpl implements Service {
    @Override
    public void subscribe(BankCard bankCard) {

    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String str) {
        return Optional.empty();
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
