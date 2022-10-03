package MaksymHryhorov.lab1;

import model.User;
import serviceimpl.ServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Mike", "Vasovskiy", LocalDate.now()));
        userList.add(new User("Name", "Bulgak", LocalDate.now()));

        ServiceImpl service = new ServiceImpl();

        service.setUser(userList);

        for (User user : service.getAllUsers()) {
            System.out.println(user);
        }
    }

}