package org.graphql.subscriptiondemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.info.BuildProperties;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
@RequiredArgsConstructor
public class AppVersionResolver {

    private final BuildProperties buildProperties;

    @QueryMapping
    public Mono<String> appVersion() {
        return Mono.just(buildProperties.getVersion());
    }
}
