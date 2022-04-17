package com.study.guice.sample;

public class DefaultLoggerImpl implements Logger{
    public void info(String info) {
        System.out.println(info);
    }
}
