package com.springadvence.education.log.templateCallback;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeLogTemplate {
    public void excute(Callback callback){
        long startTimeMs = System.currentTimeMillis();

        callback.call();

        long endTimeMs = System.currentTimeMillis();
        long resultTimeMs = endTimeMs - startTimeMs;
        log.info("resultTimeMs = {}", resultTimeMs);


    }
}
