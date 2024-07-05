package com.carsale.response;

import com.carsale.pojo.Product;
import com.carsale.pojo.User;
import com.carsale.pojo.Warehouse;
import lombok.Data;

import java.util.Date;

@Data
public class orderResponse {
    private Integer id;
    private String brand;
    private String model;
    private String user;
    private String phone;
    private String warehouse;
    private Date createtime;

}

