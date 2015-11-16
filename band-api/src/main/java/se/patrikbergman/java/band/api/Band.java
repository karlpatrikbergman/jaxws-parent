package se.patrikbergman.java.band.api;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Band {
    String name;
    String description;
    int rockFactor;
}
