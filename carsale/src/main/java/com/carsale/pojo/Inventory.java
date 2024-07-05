package com.carsale.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName inventory
 */
@Data
@TableName("inventory")
public class Inventory implements Serializable {


    @TableId
    private Integer id;

    private Integer productId;

    private Integer warehouseId;

    private Integer quantity;

    private static final long serialVersionUID = 1L;
}