package org.graphql.subscriptiondemo.controller;

import java.time.Duration;
import java.util.UUID;
import lombok.NonNull;
import org.graphql.subscriptiondemo.dto.Event;
import org.graphql.subscriptiondemo.dto.EventsInput;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.SubscriptionMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

@Controller
public class EventsResolver {

    @SubscriptionMapping
    public Flux<Event> events(@Argument @NonNull final EventsInput input) {
        return Flux.interval(Duration.ofMillis(input.getInterval()))
                .map(unused -> Event.builder().id(UUID.randomUUID()).payload(input.getPayload()).build());
    }
}