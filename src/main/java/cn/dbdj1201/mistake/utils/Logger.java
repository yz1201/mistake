package cn.dbdj1201.mistake.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.SourceLocation;
import org.aspectj.runtime.internal.AroundClosure;
import org.springframework.stereotype.Component;

/**
 * @author tyz1201
 * @datetime 2020-03-05 10:39
 * 用于记录日志的工具类，提供了公共代码
 **/
@Component("logger")
@Aspect
public class Logger {

    @Pointcut("execution(* cn.dbdj1201.mistake.service.impl.*.*(..))")
    public void ptc() {
    }

    /**
     * 用于打印日志，计划让其在切入点方法执行之前执行（切入点方法就是业务层方法）
     */
    public void printLogBefore() {
        System.out.println(" before log ");
    }


    public void printLogAfter() {
        System.out.println(" finally log ");
    }

    public void printLogAfterReturning() {
        System.out.println(" after returning log ");
    }


    public void printLogException() {
        System.out.println(" exception log ");
    }

    @Around("ptc()")
    public Object printLogAround(ProceedingJoinPoint pjp) {
        Object value = null;
        try {
            System.out.println(" around before log ");

            value = pjp.proceed(pjp.getArgs()); //相当于调用了切入点方法
            System.out.println(" around after log ");

        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println(" around exception log ");

        } finally {
            System.out.println(" around finally log ");
        }
        return value;

    }

}
