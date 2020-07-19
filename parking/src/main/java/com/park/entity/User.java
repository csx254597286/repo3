package com.park.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 用户实体类
 */
@Data //生成了setget方法
@NoArgsConstructor //生成无参构造函数
@AllArgsConstructor  //生成有参构造函数
@Accessors(chain = true)  //可以让实体类进行链式操作
public class User {
    //用户编号
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    //用户姓名
    private String userName;

    //用户密码
    private String userPwd;

    //用户手机号
    private String userPhone;

    //车牌号
    private String userCarID;

    //余额
    private Integer userBalance = 0;

    //消费总额
    private Integer userAmount = 0;

    //用户状态，1会员，0非会员
    private Integer userStatus = 0;
}
