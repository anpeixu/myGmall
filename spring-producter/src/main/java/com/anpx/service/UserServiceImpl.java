package com.anpx.service;

import com.alibaba.dubbo.config.annotation.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String uTest() {
        SimpleDateFormat sdf=new SimpleDateFormat("yy-mm-dd HH:mm:ss");
        String s = sdf.format(new Date());
        return s;
    }
}
