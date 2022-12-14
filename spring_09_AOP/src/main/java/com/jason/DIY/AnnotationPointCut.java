package com.jason.DIY;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.jason.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("========Before==========");
    }

    @After("execution(* com.jason.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("========After==========");
    }
}
