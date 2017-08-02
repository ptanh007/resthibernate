package me.resthibernate.controller;

import me.resthibernate.model.User;
import me.resthibernate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author tuanhpham
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userDao;

    @RequestMapping("/list")
    public Iterable<User> getUserLogin(){
        Iterable<User> userIterable = userDao.findAll();
        return userIterable;
    }

    @RequestMapping(value = "/{socialid}")
    public User getUserBySocialId(@PathVariable String socialid){
        //regrex valid check socialId
        return userDao.findBySocialId(socialid);
    }
}
