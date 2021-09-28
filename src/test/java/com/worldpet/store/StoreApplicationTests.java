package com.worldpet.store;

import com.worldpet.store.entities.Pet;
import com.worldpet.store.entities.Tutor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class StoreApplicationTests {

	@Test
	void testaNovoPet() {
	Pet pet = Pet.builder()
			.age(4)
			.breed("SRD")
			.name("Caramelo")
			.build();


	assertEquals("Caramelo", pet.getName());
	assertEquals("SRD", pet.getBreed());
	assertEquals(4, pet.getAge());

	}

	@Test
	void testaNovoTutor() {
		Pet pet =Pet.builder()
				.age(4)
				.breed("SRD")
				.name("Caramelo")
				.build();

	Tutor tutor = Tutor.builder()
			.phoneNumber("22 9 9999-9999")
			.name("Iago")
			.pet(pet)
			.build();


	assertEquals("Iago", tutor.getName());
	assertEquals("22 9 9999-9999", tutor.getPhoneNumber());
	assertEquals("Caramelo", tutor.getPet().getName());
	assertEquals("SRD", tutor.getPet().getBreed());
	assertEquals(4, tutor.getPet().getAge());

	}




}
