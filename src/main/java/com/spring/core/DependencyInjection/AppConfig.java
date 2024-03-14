package com.spring.core.DependencyInjection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@Controller
@ComponentScan(basePackages = "com.spring.core.DependencyInjection")
public class AppConfig {
}
