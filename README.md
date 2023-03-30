# subscriptiondemo
Sample GraphQL Subscription Service.

This is a tiny application that provides GraphQL API with a support of GraphQL subscriptions.

The application is intended to be used for test purposes.

## GraphQL API

Here's a full GraphQL schema:

```graphql
type Query {
    """
    Returns application version.
    """
    appVersion: String!
}

type Subscription {
    events(input: EventsInput!): Event!
}

type Event {
    id: ID!
    payload: String!
}

input EventsInput {
    interval: Int! = 1000
    payload: String!
}
```

## Requirements

* Java 17 or higher.