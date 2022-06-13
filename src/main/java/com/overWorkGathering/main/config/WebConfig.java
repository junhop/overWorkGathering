package com.overWorkGathering.main.config;

import com.overWorkGathering.main.controller.LogginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new LogginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/SignUp");
    }
}
