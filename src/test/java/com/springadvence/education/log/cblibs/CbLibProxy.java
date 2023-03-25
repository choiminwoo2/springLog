package com.springadvence.education.log.cblibs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@Slf4j
public class CbLibProxy implements MethodInterceptor {
    private Object target;

    public CbLibProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        log.info("TimeInvocationHadnler 실행");
        long startTime = System.currentTimeMillis();
        Object result = methodProxy.invoke(target, args);
        long endTime = System.currentTimeMillis();
        long resultTimeMs = endTime - startTime;
        log.info("resultTimeMs = {}", resultTimeMs);
        return result;
    }
}
