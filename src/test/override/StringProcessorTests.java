package com.devskiller.evaluation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.devskiller.sample.CommonsStringProcessor;
import com.devskiller.sample.StringProcessor;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringProcessorTests {

	@ParameterizedTest(name = "{0} => {1}")
	@CsvSource({
			"abc,    abc",
			"defgh,  d...",
			"zzzzz,  z..."
	})
	void shouldAbbreviateString(String input, String expectedResult) {
		StringProcessor stringProcessor = new CommonsStringProcessor();
		assertEquals(expectedResult, stringProcessor.abbreviate(input, 4));
	}
}