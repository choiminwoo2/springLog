package com.springadvence.education.api.v3;

import com.springadvence.education.config.log.LogTrace;
import com.springadvence.education.config.log.callback.TraceTemplate;
import com.springadvence.education.config.log.template.AbstractTemplate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MemberControllerV3 {

    private final MemberServiceV3 memberService;
    private final TraceTemplate traceTemplate;
    public MemberControllerV3(MemberServiceV3 memberService, LogTrace trace ){
        this.memberService = memberService;
        this.traceTemplate = new TraceTemplate(trace);
    }
    @GetMapping("v3/member")
    public String insertMember(String userId){
        return traceTemplate.execute("MemberController.insertMember()", () -> {
            memberService.save(userId);
            return "ok";
        });

    }
}
