package com.anpx.controller;
import com.anpx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CController {

    @Autowired
    private UserService userService;

    @RequestMapping("cTest")
    @ResponseBody
    public String uTest(){
        return userService.uTest();
    }

}
