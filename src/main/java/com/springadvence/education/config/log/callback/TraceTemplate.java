package com.springadvence.education.config.log.callback;

import com.springadvence.education.config.log.LogTrace;
import com.springadvence.education.config.log.TraceStatus;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TraceTemplate {
    private final LogTrace trace;

    public <T> T execute(String message, TraceCallback<T> callback){
        TraceStatus status = null;
        try{
            status = trace.begin(message);
            T result = callback.call();
            trace.end(status);
            return result;
        }catch (Exception e){
            trace.exception(status, e);
            throw e;
        }
    }
}
