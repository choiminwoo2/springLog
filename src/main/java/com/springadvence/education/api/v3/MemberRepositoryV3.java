package com.springadvence.education.api.v3;

import com.springadvence.education.config.log.LogTrace;
import com.springadvence.education.config.log.callback.TraceTemplate;
import com.springadvence.education.config.log.template.AbstractTemplate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class MemberRepositoryV3 {

    private final TraceTemplate traceTemplate;

    public MemberRepositoryV3(LogTrace trace){
        this.traceTemplate = new TraceTemplate(trace);
    }

    public void save(String userId) {
        traceTemplate.execute("MemberRepository.save()",() -> {
            if (userId.equals("ex")) {
                throw new IllegalStateException("예외 발생!");
            }
            sleep(1000);
            return null;
        });
    }

    private void sleep(int mils){
        try {
            Thread.sleep(mils);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
