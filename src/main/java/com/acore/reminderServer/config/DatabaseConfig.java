package com.acore.reminderServer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@Configuration
@EnableJpaRepositories("com.acore.reminderServer.repository")
@EnableTransactionManagement
@ComponentScan("com.acore.reminderServer")
public class DatabaseConfig {
    @Resource
    private Environment env;

}
