package com.study.guice.sample;

import com.google.inject.Inject;

public class Communication {

    @Inject
    private Logger logger;

    @Inject
    private Communicator communicator;

    public void sendMessage(String message) {
        logger.info(message);
        communicator.sendMessage(message);
    }

}
