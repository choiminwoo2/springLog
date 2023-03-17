package com.springadvence.education.config.log;

public interface LogProvider {
    TraceStatus begin(String message);
    void end(TraceStatus status);
    void exception(TraceStatus status, Exception e);
}
