package com.springadvence.education.log.springproxyfactory;

import com.springadvence.education.log.cblibs.MemberInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MemberImpl1 implements MemberInterface1 {

    @Override
    public void save() {
        log.info("MemberImpl.save() 실행");
    }

    @Override
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
