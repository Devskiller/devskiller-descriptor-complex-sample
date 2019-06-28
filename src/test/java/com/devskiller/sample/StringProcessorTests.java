package com.devskiller.sample;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringProcessorTests {

	@ParameterizedTest(name = "{0} => {1}")
	@CsvSource({
			"abc,    abc",
			"defgh,  d..."
	})
	void shouldAbbreviateString(String input, String expectedResult) {
		StringProcessor stringProcessor = new CommonsStringProcessor();
		assertEquals(expectedResult, stringProcessor.abbreviate(input, 4));
	}
}