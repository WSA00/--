package com.carsale.pojo;

import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName order
 */
@Data
public class Order implements Serializable {
    @TableId(value = "orderid")
    private Integer id;

    private Integer productId;

    private Integer userId;

    private Integer warehouseId;

    private Date createtime;

    private static final long serialVersionUID = 1L;
}