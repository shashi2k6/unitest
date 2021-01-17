package com.unit.unit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class UnitApplicationTests {

	@Mock
	private UnitService unitService;

	@BeforeEach
	void setup(){
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void test_restController() {
		when(unitRestController.getMessage(anyString())).thenReturn(null);
	}

	@InjectMocks
	private UnitRestController unitRestController;

}
