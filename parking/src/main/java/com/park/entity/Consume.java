package com.park.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 会员消费记录实体类
 */
@Data //生成了setget方法
@NoArgsConstructor //生成无参构造函数
@AllArgsConstructor  //生成有参构造函数
@Accessors(chain = true)  //可以让实体类进行链式操作
public class Consume {
    //消费记录编号
    @TableId(value = "consume_id", type = IdType.AUTO)
    private Integer consumeId;

    //会员编号
    private Integer consumeUserID;

    //车牌号
    private String consumeCarID;

    //停车费
    private Integer consumePrice;

    //优惠后实际费用
    private Integer consumePayAmount;

    //支付时间
    // @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String consumePayTime;
}
