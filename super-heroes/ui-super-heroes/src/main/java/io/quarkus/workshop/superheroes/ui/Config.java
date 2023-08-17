package io.quarkus.workshop.superheroes.ui;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.quarkus.runtime.annotations.RegisterForReflection;


@JsonNaming(PropertyNamingStrategies.UpperSnakeCaseStrategy.class)
@RegisterForReflection
public record Config(String apiBaseUrl, boolean calculateApiBaseUrl) {
}
