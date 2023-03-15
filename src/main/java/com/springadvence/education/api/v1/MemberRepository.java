package com.springadvence.education.api.v1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Slf4j
public class MemberRepository {

    public void save() {
        log.info("MemberRepository.save()");
    }
}
