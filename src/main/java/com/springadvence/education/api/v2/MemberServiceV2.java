package com.springadvence.education.api.v2;

import com.springadvence.education.config.log.LogTrace;
import com.springadvence.education.config.log.template.AbstractTemplate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberServiceV2 {

    private final MemberRepositoryV2 memberRepository;

    private final LogTrace trace;
    public void save(String userId) {
        AbstractTemplate<Void> template = new AbstractTemplate<>(trace) {
            @Override
            protected Void call() {
                memberRepository.save(userId);
                return null;
            }
        };
        template.excute("MemberService.save()");

    }
}
