package com.springadvence.education.log.springproxyfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MemberTestImpl {

    public void save() {
        log.info("MemberImpl.save() 실행");
    }


    public void selectMember() {
        sleep(1000);
        log.info("MemberImpl.selectMember() 실행");
    }

    private void sleep(int mils) {
        try {
            Thread.sleep(mils);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
