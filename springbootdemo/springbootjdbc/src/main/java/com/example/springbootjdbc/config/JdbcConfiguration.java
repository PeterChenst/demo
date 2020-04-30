package com.example.springbootjdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

//数据源Jdbc配置类
//@Configuration
//@PropertySource("classpath:/jdbc.properties") //加载指定配置文件
@EnableConfigurationProperties(JdbcProperties.class)//指定加载哪个配置信息属性类
public class JdbcConfiguration {

    /*@Autowired
    private JdbcProperties jdbcProperties;

    public JdbcConfig(JdbcProperties jdbcProperties){
        this.jdbcProperties = jdbcProperties;
    }*/

   /** @Value("${jdbc.driverClassName}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;**/

    //实例化Druid
    @Bean
    public DataSource getDataSource(JdbcProperties jdbcProperties){
        DruidDataSource source = new DruidDataSource();
        source.setPassword(jdbcProperties.getPassword());
        source.setUsername(jdbcProperties.getUsername());
        source.setUrl(jdbcProperties.getUrl());
        source.setDriverClassName(jdbcProperties.getDriverClassName());
        return source;
    }
}

