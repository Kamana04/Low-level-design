package splitwise.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {

    List<User> userList;

    public UserController() {
        userList = new ArrayList<>();
    }

    //add user
    public void addUser(User user) {
        userList.add(user);
    }

    //getUser
    public User getUser(String userId) {
        for (User user : userList) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    //getAllUsers
    public List<User> getAllUsers() {
        return userList;
    }
}
