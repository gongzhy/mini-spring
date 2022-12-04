package com.gongzhy.springframework.test.bean;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class UserService {

    private String uId;

    private UserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(uId);
    }

}
