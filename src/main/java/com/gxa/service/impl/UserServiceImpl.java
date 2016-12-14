package com.gxa.service.impl;

import com.gxa.dao.UserMapper;
import com.gxa.domain.User;
import com.gxa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Created by Raymond on 2016/12/14.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserMapper mapper;

    public UserServiceImpl(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<User> findAll() {
        return mapper.selectAll();
    }
}
