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
     * @return new user ID
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * user log in
     *
     * @param userAccount
     * @param userPassword
     * @param request
     * @return User information after hiding sensitive information
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

}

