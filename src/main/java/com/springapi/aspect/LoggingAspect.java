package com.springapi.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

//    @Around("execution(* com.springapi..*(..))")
//    public Object ApplyLogging(ProceedingJoinPoint joinPoint) throws Throwable {
//        MethodSignature Signature = (MethodSignature) joinPoint.getSignature();
//
//        String ClassName = Signature.getDeclaringType().getName();
//        String MethodName = Signature.getName();
//
//        System.out.println("Entering " + ClassName + ", Into " + MethodName);
//        Object result = joinPoint.proceed();
//
//        System.out.println("Exiting " + ClassName + ", From " + MethodName);
//        return result;
//    }
}
