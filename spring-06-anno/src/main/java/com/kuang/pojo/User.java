package com.kuang.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.kuang.pojo.User"/>

@Component
@Scope("singleton")
//设置为单例模式
public class User {
    //等价于 <property name="name" value="秦疆"/>
    @Value("秦疆")
    public String name;
}
