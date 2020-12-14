package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(public * com.example.controller.*.*(..))")
    public void MyAspect() {

    }

    @Before("MyAspect()")
    public void before() {
        System.out.println("前置通知");
    }

    @After("MyAspect()")
    public void after(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getArgs()[0]);
        System.out.println("后置通知");
    }

    @Around("MyAspect()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知1");
        //方法放行
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("环绕通知2");
        return proceed;
    }
}
