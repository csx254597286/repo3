package com.park.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 管理员实体类
 */
@Data //生成了setget方法
@NoArgsConstructor //生成无参构造函数
@AllArgsConstructor  //生成有参构造函数
@Accessors(chain = true)  //可以让实体类进行链式操作
public class Admin {
    //管理员编号
    @TableId(value = "admin_id",type = IdType.AUTO)
    private Integer adminId;

    //管理员姓名
    private String adminName;

    //管理员密码
    private String adminPwd;

    //管理员手机号
    private String adminPhone;
}
