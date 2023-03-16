package com.springadvence.education.config.log;

import lombok.Getter;

import java.util.UUID;

@Getter
public class TraceId {
    private String id;
    private int level;

    public TraceId(){
        this.id = createId();
        this.level = 0;
    }

    private TraceId(String id, int level){
        this.id = id;
        this.level = level;
    }

    private String createId(){
        String randomId = UUID.randomUUID().toString();
        return randomId.substring(0, randomId.indexOf("-"));
    }

    public TraceId createNextId(){
        return new TraceId(id,level + 1);
    }

    public TraceId createPreviousId(){
        return new TraceId(id,level - 1);
    }

    public boolean isFirstLevel(){
        return level == 0;
    }

}
