package com.springadvence.education.log.decorator;

import com.springadvence.education.log.decorator.code.DecoreatePatternClient;
import com.springadvence.education.log.decorator.code.MessageDecorator;
import com.springadvence.education.log.decorator.code.RealComponent;
import com.springadvence.education.log.decorator.code.TimeDecorator;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class DecoreatePatternClientTest {

    @Test
    void noDecoratorV1(){
        RealComponent realComponent = new RealComponent();
        DecoreatePatternClient decoreatePatternClient = new DecoreatePatternClient(realComponent);
        decoreatePatternClient.execute();
    }

    @Test
    void decoratorV1(){
        RealComponent realComponent = new RealComponent();
        MessageDecorator messageDecorator = new MessageDecorator(realComponent);
        DecoreatePatternClient decoreatePatternClient = new DecoreatePatternClient(messageDecorator);
        decoreatePatternClient.execute();
    }

    @Test
    void decoratorV2(){
        RealComponent realComponent = new RealComponent();
        MessageDecorator messageDecorator = new MessageDecorator(realComponent);
        TimeDecorator timeDecorator = new TimeDecorator(messageDecorator);
        DecoreatePatternClient decoreatePatternClient = new DecoreatePatternClient(timeDecorator);
        decoreatePatternClient.execute();
    }
}
