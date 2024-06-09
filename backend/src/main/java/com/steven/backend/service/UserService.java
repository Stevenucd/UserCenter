package com.steven.backend.service;

import com.steven.backend.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

public interface UserService extends IService<User> {

    /**
     * user registration
     *
     * @param userAccount
     * @param userPassword
     * @param checkPassword
     * @param planetCode
     * @return new user ID
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

}

