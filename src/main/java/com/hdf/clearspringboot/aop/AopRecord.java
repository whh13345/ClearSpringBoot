package com.hdf.clearspringboot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class AopRecord {

    @Pointcut("execution(* com.hdf.clearspringboot.controller.HelloController.*()))")
    public void pointcut(){

    }

    @Pointcut("execution(* com.hdf.clearspringboot.*.*.*()))")
    public void pointcut1(){

    }



    // @After("pointcut()")
    // public void after(JoinPoint joinPoint){
    //     log.info("执行的方法"+joinPoint.getSignature().getDeclaringTypeName());
       
    // }

    //不能代理websocket类
//    @Around("pointcut1()")
//    public Object before(ProceedingJoinPoint joinPoint) {
//        String methodName = joinPoint.getSignature().getDeclaringTypeName();
//        StopWatch watch = new StopWatch();
//        watch.start("watch1");
//        Object proceed = null;
//        try {
//            proceed = joinPoint.proceed();
//            watch.stop();
//            log.info("执行方法:{} 耗时 : {}", methodName + "." + joinPoint.getSignature().getName(), watch.getTotalTimeMillis());
//        } catch (Throwable e) {
//            e.printStackTrace();
//        }
//        return proceed;
//    }
    
}
