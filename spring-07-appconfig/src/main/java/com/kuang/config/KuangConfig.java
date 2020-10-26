package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration // 这个也会被Spring容器托管
@ComponentScan("com.kuang.pojo")
@Import(KuangConfig2.class)
public class KuangConfig {
    //自己定义的配置类

    @Bean
    // 注册哟一个bean 相当于之前的bean标签
    //方法名相当于bean标签中的id
    //返回值相当于bean标签中的class属性
    public User getUser() {
        return new User();
    }
}
