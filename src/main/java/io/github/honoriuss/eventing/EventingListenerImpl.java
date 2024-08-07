package io.github.honoriuss.eventing;

import io.github.honoriuss.blossom.interfaces.ITrackingWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;

class EventingListenerImpl implements ITrackingWriter<String> {
    private final Logger logger = LoggerFactory.getLogger(EventingListenerImpl.class);

    @Override
    @EventListener
    public void write(String message) {
        logger.info("Write event: {}", message);
    }
}
