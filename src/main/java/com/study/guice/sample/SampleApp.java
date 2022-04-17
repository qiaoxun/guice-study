package com.study.guice.sample;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class SampleApp {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BasicModule());
        Communication communication = injector.getInstance(Communication.class);
        communication.sendMessage("Hello World");
    }
}
