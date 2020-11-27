package com.wang.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther wangchao
 * @create 2020-11-26 19:09:50
 * @describe 实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "User对象", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.UUID)
    private String userId;

    @TableField("user_name")
    private String userName;

    @TableField("user_age")
    private String userAge;


}