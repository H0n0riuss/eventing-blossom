package io.github.honoriuss.eventing;

import io.github.honoriuss.blossom.interfaces.ITrackingHandler;
import io.github.honoriuss.blossom.interfaces.ITrackingWriter;
import org.springframework.context.ApplicationEventPublisher;

abstract class EventingFactory {

    public static ITrackingHandler<String> getDefaultTrackingPublisher(ApplicationEventPublisher applicationEventPublisher) {
        return new EventingPublisherImpl(applicationEventPublisher);
    }

    public static ITrackingWriter<String> getDefaultListener() {
        return new EventingListenerImpl();
    }
}
