package com.springadvence.education.api.v3;

import com.springadvence.education.config.log.LogTrace;
import com.springadvence.education.config.log.callback.TraceTemplate;
import com.springadvence.education.config.log.template.AbstractTemplate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MemberServiceV3 {

    private final MemberRepositoryV3 memberRepository;
    private final TraceTemplate traceTemplate;
    public MemberServiceV3(MemberRepositoryV3 memberRepository, LogTrace trace ){
        this.memberRepository = memberRepository;
        this.traceTemplate = new TraceTemplate(trace);
    }

    public void save(String userId) {
        traceTemplate.execute("MemberService.save()",() -> {
            memberRepository.save(userId);
            return null;
        });
    }
}
