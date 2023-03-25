package com.springadvence.education.log.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoreatePatternClient {

    private Component component;

    public DecoreatePatternClient(Component component){
        this.component = component;
    }

    public void execute(){
        String result = component.operation();
        log.info("Result = {}", result);
    }


}
