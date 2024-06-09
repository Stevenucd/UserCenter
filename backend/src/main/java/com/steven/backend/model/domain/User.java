package com.steven.backend.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * user table
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * username
     */
    private String username;

    /**
     * account number
     */
    private String userAccount;

    /**
     * user avatar
     */
    private String avatarUrl;

    /**
     * user gender
     */
    private Integer gender;

    /**
     * user password
     */
    private String userPassword;

    /**
     * phone number
     */
    private String phone;

    /**
     * user email
     */
    private String email;

    /**
     * user status 0-normal
     */
    private Integer userStatus;

    /**
     * create time
     */
    private Date createTime;

    /**
     * update time
     */
    private Date updateTime;

    /**
     * 
     */
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}