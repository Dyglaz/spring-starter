package com.kiselev.spring;

import com.kiselev.spring.config.ApplicationConfiguration;
import com.kiselev.spring.config.DatabaseProperties;
import com.kiselev.spring.database.pool.ConnectionPool;
import com.kiselev.spring.database.repository.CompanyRepository;
import com.kiselev.spring.database.repository.CrudRepository;
import com.kiselev.spring.database.repository.UserRepository;
import com.kiselev.spring.ioc.Container;
import com.kiselev.spring.service.CompanyService;
import com.kiselev.spring.service.UserServise;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.io.Serializable;

@SpringBootApplication
@ConfigurationPropertiesScan
public class ApplicationRunner {

    public static void main(String[] args) {
        var context = SpringApplication.run(ApplicationRunner.class, args);
        System.out.println(context.getBeanDefinitionCount());
        System.out.println(context.getBean(DatabaseProperties.class));
}
}

