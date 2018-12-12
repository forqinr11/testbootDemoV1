package com.xu.modual;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//如果目录结构和springboot推荐的一样,那么只加@SpringBootApplication这一个注解就可以.
@SpringBootApplication
@MapperScan("com.xu.**.dao")
public class Application extends SpringBootServletInitializer {
    private static Logger logger = Logger.getLogger(Application.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }


    /**
     * Main Start
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("============= SpringBoot Start Success =============");
    }

}
