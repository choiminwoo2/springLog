package com.springadvence.education.log.strategy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ContextV1Test {

    @Test
    void strategyV1(){
        StrategyLogic1 strategyLogic1 = new StrategyLogic1();
        ContextV1 contextV1 = new ContextV1(strategyLogic1);
        contextV1.excute();

        StrategyLogic2 strategyLogic2 = new StrategyLogic2();
        ContextV1 contextV2 = new ContextV1(strategyLogic2);
        contextV2.excute();


    }

    @Test
    void strategyV2(){
        Strategy strategy1 = () -> log.info("비지니스로직1 실행");
        ContextV1 contextV1 = new ContextV1(strategy1);
        contextV1.excute();
        Strategy strategy2 = () -> log.info("비지니스로직2 실행");
        ContextV1 contextV2 = new ContextV1(strategy2);
        contextV2.excute();
    }

    /**
     * 선 조립 후 후 실행,
     * 어플리케이션을 설정하고 실행하는 것은 유용하지만,
     * 단점으로는 한번 정해진 전략을 유연하게 바꾸는 것이 힘든 것이 문제다.
     * 즉, 클라이언트의 여러 요구사항이 동작할 수 있는 문제에 대해서 해당 방식은 적합하지 않다.
     */
    @Test
    void strategyV3(){
        ContextV1 contextV1 = new ContextV1(() -> log.info("비지니스로직1 실행"));
        contextV1.excute();
        ContextV1 contextV2 = new ContextV1(() -> log.info("비지니스로직2 실행"));
        contextV2.excute();
    }
}
