package com.dhgate.unit.configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description 业务描叙信息
 *
 * @author Created by Iritchie.ren on 2020/5/15.
 */
@Configuration
@MapperScan("com.dhgate.unit.mapper")
public class DataSourceConfiguration {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
