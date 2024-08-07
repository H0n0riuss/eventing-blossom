package io.github.h0n0riuss.eventing.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
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
