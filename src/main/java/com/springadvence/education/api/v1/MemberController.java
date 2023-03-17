package com.springadvence.education.api.v1;

import com.springadvence.education.config.log.LogTrace;
import com.springadvence.education.config.log.TraceStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;
    private final LogTrace trace;
    @GetMapping("v1/member")
    public String insertMember(String userId){
        TraceStatus status = null;
        try{
            status = trace.begin("MemberController.insertMember()");
            memberService.save(userId);
            trace.end(status);
        }catch (Exception e){
            trace.exception(status, e);
            throw e;
        }

        return "ok";
    }
}
