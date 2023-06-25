package com.example.AddTwoNumbers;

import com.example.AddTwoNumbers.domain.Addition;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AddTwoNumbersApplicationTests {
	Addition addition = new Addition();
	//
	@Test
	public void testAdd() {
		int result = addition.addTwoNumbers();
		assertEquals(result, addition.addTwoNumbers());
	}

}
