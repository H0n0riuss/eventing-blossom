package io.github.honoriuss.eventing;

import io.github.honoriuss.blossom.interfaces.ITrackingHandler;
import org.springframework.context.ApplicationEventPublisher;

class EventingPublisherImpl implements ITrackingHandler<String> {
    private final ApplicationEventPublisher applicationEventPublisher;

    EventingPublisherImpl(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public void handleTracking(String message) {
        applicationEventPublisher.publishEvent(message);
    }
}
