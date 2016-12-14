package com.gxa.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * Created by Raymond on 2016/12/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class UserServiceTest {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private UserService userService;

    @Test
    public void findAll() throws Exception {
        Assert.assertEquals(1,userService.findAll().size());
    }

}