package org.graphql.subscriptiondemo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
public class Event {

    @NonNull
    private final String id;

    @NonNull
    private final String payload;
}
