package com.gxa.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Raymond on 2016/12/13.
 */

@Controller
public class SystemController {

    @ResponseBody
    @RequestMapping("/")
    public Object test(){
        List<String> strings = new ArrayList<>();
        strings.add("321");
        strings.add("发呢安慰法");
        return strings;
    }
}
