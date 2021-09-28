package com.worldpet.store.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tutor {

    String name;
    String phoneNumber;
    Pet pet;
}
