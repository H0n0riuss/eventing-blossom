package io.github.honoriuss.eventing;

import io.github.honoriuss.blossom.interfaces.ITrackingHandler;
import io.github.honoriuss.blossom.interfaces.ITrackingWriter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
class EventingConfig {

    @Bean
    @ConditionalOnMissingBean(ITrackingHandler.class)
    @ConditionalOnProperty(name = "blossom.eventing", havingValue = "true")
    public ITrackingHandler<String> getPublisher(ApplicationEventPublisher applicationEventPublisher) {
        return EventingFactory.getDefaultTrackingPublisher(applicationEventPublisher);
    }

    @Bean
    @ConditionalOnMissingBean(ITrackingWriter.class)
    @ConditionalOnProperty(name = "blossom.eventing", havingValue = "true")
    public ITrackingWriter<String> getListener() {
        return EventingFactory.getDefaultListener();
    }
}

@Order
@Configuration
@ComponentScan(basePackages = "io.github.honoriuss.blossom")
class LaterConfig {
}
