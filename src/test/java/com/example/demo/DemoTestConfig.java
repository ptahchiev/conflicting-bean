package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Petar Tahchiev
 * @since 2.2.2
 */
@Configuration
@ComponentScan(basePackages = { "com.example.demo" })
public class DemoTestConfig implements WebMvcConfigurer {
}
