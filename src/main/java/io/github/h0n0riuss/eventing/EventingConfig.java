package io.github.h0n0riuss.eventing;

import io.github.honoriuss.blossom.interfaces.ITrackingHandler;
import io.github.honoriuss.blossom.interfaces.ITrackingWriter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;

class EventingConfig {

    @Bean
    @ConditionalOnMissingBean(ITrackingHandler.class)
    @ConditionalOnProperty(name = "blossom.event", havingValue = "true")
    public ITrackingHandler<String> getPublisher(ApplicationEventPublisher applicationEventPublisher) {
        return EventingFactory.getDefaultTrackingPublisher(applicationEventPublisher);
    }

    @Bean
    @ConditionalOnMissingBean(ITrackingWriter.class)
    @ConditionalOnProperty(name = "blossom.event", havingValue = "true")
    public ITrackingWriter<String> getListener() {
        return EventingFactory.getDefaultListener();
    }
}
