package com.park.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 停车信息实体类
 */
@Data //生成了setget方法
@NoArgsConstructor //生成无参构造函数
@AllArgsConstructor  //生成有参构造函数
@Accessors(chain = true)  //可以让实体类进行链式操作
public class Park {
    //车辆编号
    @TableId(value = "park_id", type = IdType.AUTO)
    private Integer parkId;

    //车牌号
    private String parkCarID;

    //入库时间
    private String parkEnterTime;

    //出库时间
    private String parkOutTime;

    //停车费
    private Integer parkPrice;

    /**
     * 支付状态
     * 默认为0未付款，1已付款
     */
    private Integer parkStatus = 0;

    //车辆颜色
    private String parkCarColor;

    //车辆类型
    private String parkCarType;

    //停车位
    private Integer parkPosition;

    //车辆图片
    private String parkCarImg;
}
