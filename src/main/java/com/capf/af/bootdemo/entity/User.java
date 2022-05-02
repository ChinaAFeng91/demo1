package com.capf.af.bootdemo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Data : 注解在类上, 为类提供读写属性, 此外还提供了 equals()、hashCode()、toString() 方法
 * @Getter/@Setter : 注解在类上, 为类提供读写属性
 * @ToString : 注解在类上, 为类提供 toString() 方法
 * @Slf4j : 注解在类上, 为类提供一个属性名为 log 的 log4j 的日志对象
 * @Log4j : 注解在类上, 为类提供一个属性名为 log 的 log4j 的日志对象
 * */

@Data
public class User implements Serializable {

    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
}
