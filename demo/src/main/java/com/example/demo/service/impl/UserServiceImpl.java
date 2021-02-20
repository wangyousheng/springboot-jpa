package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.entity.UserLog;
import com.example.demo.repository.UserLogRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserLogRepository userLogRepository;
    @Autowired
    private UserRepository userRepository;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addUser(User user) {
        Iterable<UserLog> all = userLogRepository.findAll();
        System.out.println(all);
        User save = userRepository.save(user);
        System.out.println(save);
        UserLog userLog = new UserLog();
        userLog.setLogs(save.toString());
        userLogRepository.save(userLog);
        all = userLogRepository.findAll();
        System.out.println(all);
    }
}

