package com.hackerOJ.config;

import com.hackerOJ.common.util.annotation.testSlave;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Slf4j
@Configuration
@ConfigurationProperties("hackeroj.datasource.test")
@MapperScan(annotationClass = testSlave.class, basePackages = "com.hackerOJ.proc", sqlSessionFactoryRef = "infoTestSqlSessionFactory")
public class DataBaseTestSlaveConfig extends HikariConfig{
    @Value("${mybatis.mapper-locations}")String mapperLocation = "";

    @Bean(name = "infoTestDataSource", destroyMethod = "close")
    public HikariDataSource slave1DataSource() {
        return new HikariDataSource(this);
    }

    @Bean(name = "infoTestSqlSessionFactory")
    public SqlSessionFactory infoSlave1SqlSessionFactory(@Qualifier("infoTestDataSource") DataSource infoTestDataSource) throws Exception {
        return new hackerOJSqlSessionFactory().getSqlFactory(infoTestDataSource, mapperLocation);
    }

}
