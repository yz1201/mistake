package cn.dbdj1201.mistake.utils;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author tyz1201
 * @datetime 2020-03-05 10:39
 * 用于记录日志的工具类，提供了公共代码
 **/
@Component("logger")
@Aspect("logAdvice")
public class Logger {
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

    public void printLogAround() {
        System.out.println(" around log ");
    }

}
