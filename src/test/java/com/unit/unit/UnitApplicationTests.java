package com.unit.unit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.when;

@SpringBootTest
class UnitApplicationTests {

	@BeforeEach
	void setup(){
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void test_restController() {
		when(unitRestController.getMessage()).thenReturn("");
	}

	@InjectMocks
	private UnitRestController unitRestController;

}
