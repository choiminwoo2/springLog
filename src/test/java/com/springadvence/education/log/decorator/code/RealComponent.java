package com.springadvence.education.log.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealComponent implements Component{

    @Override
    public String operation() {
        log.info("리얼 컴포넌트 로그 생성 .");
        return "data";
    }
}
