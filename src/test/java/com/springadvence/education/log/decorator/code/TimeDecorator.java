package com.springadvence.education.log.decorator.code;

public class TimeDecorator implements Component{

    private Component component;

    public TimeDecorator(Component component){
        this.component = component;
    }

    @Override
    public String operation() {
       Long startTimeMs = System.currentTimeMillis();
       String operation = component.operation();
       sleep(1000);
       Long endTimeMs = System.currentTimeMillis();

       String result = operation + " TimeMs = " + (endTimeMs - startTimeMs);

       return result;

    }

    private void sleep(int mlils) {
        try {
            Thread.sleep(mlils);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
