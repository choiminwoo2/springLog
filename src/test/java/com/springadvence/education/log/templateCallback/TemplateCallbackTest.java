package com.springadvence.education.log.templateCallback;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateCallbackTest {

    @Test
    void callbackV1(){
        TimeLogTemplate template = new TimeLogTemplate();
        template.excute(()-> log.info("비지니스 로직1번"));
        template.excute(()-> log.info("비지니스 로직2번"));
    }
}
