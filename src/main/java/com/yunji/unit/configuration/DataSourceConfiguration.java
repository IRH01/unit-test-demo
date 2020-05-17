package com.yunji.unit.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description 业务描叙信息
 *
 * @author Created by Iritchie.ren on 2020/5/15.
 */
@Configuration
@MapperScan("com.yunji.unit.mapper")
public class DataSourceConfiguration {
}
