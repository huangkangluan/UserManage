package com.hzit.controller;

import com.hzit.interceptor.UserInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2016/10/14.
 */
public class BaseController extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        UserInterceptor userInterceptor=new UserInterceptor();
        registry.addInterceptor(userInterceptor).addPathPatterns("/home/**");
        super.addInterceptors(registry);
    }
}
