package org.allen.controller;

import org.allen.dao.UserDAO;
import org.allen.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserDAO userDAO;

    @RequestMapping("all")
    public List<User> all() {
        return userDAO.getAllUser();
    }
}
