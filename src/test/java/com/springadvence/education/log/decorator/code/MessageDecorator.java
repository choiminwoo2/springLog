package com.springadvence.education.log.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessageDecorator implements Component{

    private Component component;

    public MessageDecorator(Component component){
        this.component = component;
    }

    @Override
    public String operation() {
        log.info("MessageDecorator is Running");
        String operation = component.operation();

        String result = "****" + operation + "****";

        return result;
    }
}
