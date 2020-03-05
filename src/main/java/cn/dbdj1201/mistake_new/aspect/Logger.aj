package cn.dbdj1201.mistake_new.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 @author tyz1201
 @datetime 2020-03-05 14:57
 **/
@Component("logger")
@Aspect
public class Logger {

    @Pointcut("execution(* cn.dbdj1201.mistake_new.service.IAccountService.*(..))")
    public void ptc() {
    }

    /**
     * 环绕通知。
     * @param pjp
     * @return
     */
    public Object aroundPrintLog(ProceedingJoinPoint pjp) {
        Object value = null;
        try {
            value = pjp.proceed(pjp.getArgs());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            System.out.println(" end ");
        }
        return value;
    }
}
