package com.springadvence.education.config.log.callback;

public interface TraceCallback<T> {
    T call();
}