package com.usercenter.common.mybatisplus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 代码生成工具
 */
public class MybatisPlusGenerator {

    public static void main(String[] args) {
        // 1.全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setActiveRecord(true)// 是否开启AR模式
                .setAuthor("dhl") // 指定作者
                .setOutputDir("D:\\git-project\\springcloudvehts\\usercenter\\src\\main\\java")
                .setFileOverride(false) // 指定文件覆盖
                .setIdType(IdType.UUID) // 设置主键自增策略
                .setServiceImplName("%sService") // 设置生成的services接口的名字的首字母是否为I
                .setBaseResultMap(true) // 基本的字段映射
                .setBaseColumnList(true); // 基本的sql片段
        // 2.配置数据源
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL) // 设置数据库类型
                .setDriverName("com.mysql.jdbc.Driver")
                .setUrl("jdbc:mysql://10.11.1.5:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=Hongkong")
                .setUsername("hejian")
                .setPassword("hejian@web");
        // 3.策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true) //全局大写命名
                .setDbColumnUnderline(true) // 指定表名和字段名是否使用了下划线
                .setNaming(NamingStrategy.underline_to_camel) // 数据库字段下划线转驼峰命令策略
                .setTablePrefix("sys_") // 设置表前缀
                .setInclude("ts_member_info","ts_resource","ts_role","ts_role_resource","ts_user"); // 设置需要生成的表
        // 4.包名策略配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.usercenter") // 设置父包
                .setMapper("mapper")
                .setService("service")
                .setController("controller")
                .setEntity("entity")
                .setXml("mapper");
        // 5. 开始生成代码
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(globalConfig)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig);
        autoGenerator.execute();
    }

}