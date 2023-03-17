package com.springadvence.education.api.v1;

import com.springadvence.education.config.log.LogTrace;
import com.springadvence.education.config.log.TraceStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Slf4j
public class MemberRepository {

    private final LogTrace trace;

    public void save(String userId) {

        TraceStatus status = null;
        try {
            status = trace.begin("MemberRepository.save()");
            if (userId.equals("ex")) {
                throw new IllegalStateException("예외 발생!");
            }
            sleep(1000);
            trace.end(status);
        }catch (Exception e){
            trace.exception(status, e);
            throw e;
        }
    }

    private void sleep(int mils){
        try {
            Thread.sleep(mils);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
