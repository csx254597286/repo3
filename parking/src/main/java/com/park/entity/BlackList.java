package com.park.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 黑名单实体类
 */
@Data //生成了setget方法
@NoArgsConstructor //生成无参构造函数
@AllArgsConstructor  //生成有参构造函数
@Accessors(chain = true)  //可以让实体类进行链式操作
public class BlackList {
    //黑名单编号
    @TableId(value = "blacklist_id", type = IdType.AUTO)
    private Integer blacklistId;

    //车牌号
    private String blacklistCarID;

    //停车费
    private Integer blacklistPrice;

    //欠费次数
    private Integer blacklistCount = 1;

    //总欠费金额
    private Integer blacklistTotalPrice;

    //黑名单状态 1黑名单 0移出黑名单
    private Integer blacklistStatus = 1;

    //订单号
    private String blacklistOrderNo;
}
