package com.weds.xf;

import com.weds.core.annotation.MyBatisDao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.weds.*"})
@MapperScan(basePackages = {"com.weds.**.mapper"}, annotationClass = MyBatisDao.class)
public class LinkXfServerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication springApplication = new SpringApplication(LinkXfServerApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }
}
