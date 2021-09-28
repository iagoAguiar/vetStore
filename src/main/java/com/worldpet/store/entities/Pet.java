package com.worldpet.store.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pet {
    String name;
    String breed;
    Integer age;
}
