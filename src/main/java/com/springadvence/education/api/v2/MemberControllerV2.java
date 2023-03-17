package com.springadvence.education.api.v2;

import com.springadvence.education.config.log.ThreadLocalLogProvider;
import com.springadvence.education.config.log.TraceStatus;
import com.springadvence.education.config.log.template.AbstractTemplate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MemberControllerV2 {

    private final MemberServiceV2 memberService;
    private final ThreadLocalLogProvider trace;
    @GetMapping("v2/member")
    public String insertMember(String userId){

        AbstractTemplate<String> template = new AbstractTemplate<String>(trace) {
            @Override
            protected String call() {
                memberService.save(userId);
                return "ok";
            }
        };
        return template.excute("MemberController.insertMember()");
    }
}
