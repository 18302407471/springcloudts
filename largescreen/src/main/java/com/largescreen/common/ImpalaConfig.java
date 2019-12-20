package com.largescreen.common;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.cloudera.impala.jdbc41.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @author ：dhl
 * @date ： 2019/9/6 17:23
 * @description：impala配置
 * @version: v1.0
 */
@Configuration
public class ImpalaConfig {

    @Value("${impala.url}")
    private String impalaUrl;
    @Value("${impala.port}")
    private String impalaPort;
    @Value("${impala.schema}")
    private String impalaScheme;
    @Value("${impala.user}")
    private String impalaUser;
    @Value("${impala.password}")
    private String impalaPassword;

    @Bean
    public QueryRunner getQueryRunner(){
        Properties properties = new Properties();
        javax.sql.DataSource dataSource = new DataSource();
        try {
            properties.setProperty("driverClassName","com.cloudera.impala.jdbc41.Driver");
            properties.setProperty("url",this.impalaUrl + ":" + this.impalaPort + "/" + this.impalaScheme + ";auth=noSasl");
            properties.setProperty("initialSize","10");
            properties.setProperty("maxActive","100");
            properties.setProperty("maxWait","60000");
            properties.setProperty("timeBetweenEvictionRunsMillis","60000");
            properties.setProperty("minEvictableIdleTimeMillis","300000");
            properties.setProperty("validationQuery","SELECT 1");
            properties.setProperty("testWhileIdle","true");
            properties.setProperty("testOnBorrow","false");
            properties.setProperty("testOnReturn","false");
            properties.setProperty("poolPreparedStatements","false");
            properties.setProperty("maxPoolPreparedStatementPerConnectionSize","200");
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new QueryRunner(dataSource);
    }
}
