package org.graphql.subscriptiondemo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
public class EventsInput {

    @NonNull
    private final Integer interval;

    @NonNull
    private final Integer limit;

    @NonNull
    private final String payload;
}
