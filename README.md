# Overview

This is a simple poc using [Zipkin] and [Micronaut]

# Setup

## [Zipkin]

1. Run the command `docker run -d --net=host --name=zipkin openzipkin/zipkin:latest`
2. Open the url `http://localhost:16686`

## [Consul]

1. Run the command `docker run -d --name=consul --net=host consul:latest`
2. Open the url `http://localhost:8500`

# Testing

1. Start `catalogue-service`
2. Start `inventory-service`
3. Start `recommendation-service`
4. Open the url `http://localhost:8083/recommendations`

[Zipkin]: https://zipkin.io
[Consul]: https://www.consul.io
[Micronaut]: http://micronaut.io