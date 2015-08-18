package com.moon.mybatis.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @author quzile
 * @version 1.0
 * @since 2015/8/17
 */
@Configuration
@PropertySource("jdbc.properties")
public class AppConfig {

    @Resource
    Environment env;

    @Bean(name = "dataSource", destroyMethod = "close")
    @Description("Provides a basic data source of a bean")
    public DataSource dataSource() throws PropertyVetoException {
        // instantiate, configure and return DataSource bean...
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(env.getProperty("jdbc.driverClassName"));
        dataSource.setJdbcUrl(env.getProperty("jdbc.url"));
        dataSource.setUser(env.getProperty("jdbc.username"));
        dataSource.setPassword(env.getProperty("jdbc.password"));
        return dataSource;
    }

}
