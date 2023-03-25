package com.springadvence.education.log.cblibs;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.Enhancer;

@Slf4j
public class CbLibProxyTest {

    @Test
    void CBLIB_테스트(){
        MemberImpl target = new MemberImpl();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MemberImpl.class);
        enhancer.setCallback(new CbLibProxy(target));
        MemberImpl proxy = (MemberImpl) enhancer.create();
        proxy.save();
        proxy.selectMember();

    }
}
