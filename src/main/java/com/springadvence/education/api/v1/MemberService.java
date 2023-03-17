package com.springadvence.education.api.v1;

import com.springadvence.education.config.log.LogTrace;
import com.springadvence.education.config.log.TraceStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {

    private final MemberRepository memberRepository;

    private final LogTrace trace;
    public void save(String userId) {
        TraceStatus status = null;
        try{
            status = trace.begin("MemberService.save()");
            memberRepository.save(userId);
            trace.end(status);
        }catch (Exception e){
            trace.exception(status, e);
            throw e;
        }
    }
}
