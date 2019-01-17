package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.UserDao;
import system.model.User;

@Service
public class ValidateUserService {

    @Autowired
    private UserDao userDao;

    public String  validateUser(User user){

        if (userDao.getAllUsers().contains(user)) {
            return "valid";
        }
        return "invalid";
    }
}
