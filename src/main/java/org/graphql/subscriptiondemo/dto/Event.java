package org.graphql.subscriptiondemo.dto;

import java.util.UUID;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
public class Event {

    @NonNull
    private final UUID id;

    @NonNull
    private final String payload;
}
