package com.gxa.service;

import com.gxa.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Created by Raymond on 2016/12/14.
 */
@Service
public interface UserService {

    List<User> findAll();
}
