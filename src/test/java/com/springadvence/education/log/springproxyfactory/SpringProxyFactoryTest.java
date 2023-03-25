package com.springadvence.education.log.springproxyfactory;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.aop.framework.ProxyFactory;

@Slf4j
public class SpringProxyFactoryTest {

    @Test
    void jdkProxyTest(){
        MemberInterface1 target = new MemberImpl1();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        proxyFactory.addAdvice(new TimeAdvice());
        MemberInterface1 proxy =(MemberInterface1)proxyFactory.getProxy();
        proxy.save();
        log.info("proxy ClassName = {}", proxy.getClass());
    }

    @Test
    void cbLibTest(){
        MemberTestImpl target = new MemberTestImpl();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        proxyFactory.addAdvice(new TimeAdvice());
        MemberTestImpl proxy =(MemberTestImpl)proxyFactory.getProxy();
        proxy.save();
        log.info("proxy ClassName = {}", proxy.getClass());
    }
}
