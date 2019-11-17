package com.newler.jdweb.config;

import org.apache.ibatis.logging.log4j2.Log4j2Impl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;

@MapperScan(basePackages = "com.newler.jdweb.dao")
public class MybatisConfig {
    @Bean
    public org.apache.ibatis.session.Configuration configuration() {
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setLazyLoadingEnabled(true);
        configuration.setMapUnderscoreToCamelCase(true);
        configuration.getTypeAliasRegistry().registerAliases("com.newler.jdweb.data.pojo");
        return configuration;
    }
}
