package com.springadvence.education.config.log.template;

import com.springadvence.education.config.log.ThreadLocalLogProvider;
import com.springadvence.education.config.log.TraceStatus;

public abstract class AbstractTemplate<T> {

    private final ThreadLocalLogProvider trace;

    public AbstractTemplate(ThreadLocalLogProvider trace){
        this.trace = trace;
    }

    public T excute(String message){
        TraceStatus status = null;
        try{
            status = trace.begin(message);
            T result = call();
            trace.end(status);
            return result;
        }catch (Exception e){
            trace.exception(status, e);
            throw e;
        }
    }

    protected abstract T call();
}
