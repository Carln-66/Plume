package com.plume.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: Carl
 * @Date: 2021/04/08/18:04
 * @Description:
 */
@Configuration
@MapperScan({"com.plume.mall.mbg.mapper", "com.plume.mall.dao"})
public class MyBatisConfig {
}
