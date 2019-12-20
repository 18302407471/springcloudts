package com.zuulservice.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ：dhl
 * @date ： 2019/9/24 14:16
 * @description：swagger配置类
 * @version: v1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("分布式重型柴油车监控平台")
                .description("购物系统接口文档说明")
                .termsOfServiceUrl("http://localhost:8769")
                .contact(new Contact("杜海龙", "", "1543961217@qq.com"))
                .version("1.0")
                .build();
    }

}
