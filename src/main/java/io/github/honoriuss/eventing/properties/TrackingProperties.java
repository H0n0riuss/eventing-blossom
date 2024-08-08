package io.github.honoriuss.eventing.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "blossom")
public class TrackingProperties {
    private boolean eventing;

    public boolean isEvent() {
        return eventing;
    }

    public void setEvent(boolean eventing) {
        this.eventing = eventing;
    }
}
