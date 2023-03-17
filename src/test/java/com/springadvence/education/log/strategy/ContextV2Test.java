package com.springadvence.education.log.strategy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ContextV2Test {

    /**
     * 전략 패턴
     * 실행할 때마다, 전략을 계속 지정해야 하는 것이 문제지만,
     * 클라이언트의 요청에 따라 전략을 유연하게 바꿀 수 있다는 것이 장점.
     */
    @Test
    void strategyV1(){
       ContextV2 context1 = new ContextV2();
       context1.excute(() -> log.info("[람다] 비지니스 로직1 실행"));
       context1.excute(new StrategyLogic2());
    }
}
