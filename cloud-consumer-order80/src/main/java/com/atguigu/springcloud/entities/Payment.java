package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author: ztf
 * @program: cloud2020
 * @description: 支付实体类
 * @create: 2021-11-08 11:28
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
