package com.springadvence.education.log.threadLocal;

import com.springadvence.education.config.log.ThreadLocalLogProvider;
import com.springadvence.education.config.log.TraceStatus;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ThreadLocalLogTraceTest {
    ThreadLocalLogProvider trace = new ThreadLocalLogProvider();

    @Test
    void begin_end_level2(){
        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.begin("hello1");
        trace.end(status2);
        trace.end(status1);
    }

    @Test
    void begin_ex_level2(){
        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.begin("hello1");
        trace.exception(status2, new IllegalStateException());
        trace.exception(status1, new IllegalStateException());
    }


}
