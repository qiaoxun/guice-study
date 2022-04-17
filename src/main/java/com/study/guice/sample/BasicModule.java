package com.study.guice.sample;

import com.google.inject.AbstractModule;

public class BasicModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Communicator.class);
        bind(Logger.class).to(DefaultLoggerImpl.class);
    }
}
