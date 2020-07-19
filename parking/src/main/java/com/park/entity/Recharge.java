package com.park.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 会员充值记录实体类
 */
@Data //生成了setget方法
@NoArgsConstructor //生成无参构造函数
@AllArgsConstructor  //生成有参构造函数
@Accessors(chain = true)  //可以让实体类进行链式操作
public class Recharge {
    //充值记录编号
    @TableId(value = "recharge_id",type = IdType.AUTO)
    private Integer rechargeId;

    //会员编号
    private Integer rechargeUserID;

    //会员姓名
    private String rechargeUserName;

    //车牌号
    private String rechargeCarID;

    //充值时间
    private String rechargeTime;

    //充值金额
    private Integer rechargeAmount;
}
