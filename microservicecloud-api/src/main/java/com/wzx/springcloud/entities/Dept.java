package com.wzx.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

//@AllArgsConstructor //有参构造
@NoArgsConstructor  //无参构造
@Data        //set/get
@Accessors(chain = true) //支持链接编程
public class Dept implements Serializable {//类表关系映射---》必须序列化

    private Long deptno;
    private String dname;
    private String db_source;

}
