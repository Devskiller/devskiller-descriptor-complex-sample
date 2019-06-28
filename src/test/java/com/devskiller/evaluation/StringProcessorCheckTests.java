package com.devskiller.evaluation;

import org.junit.jupiter.api.Test;

import com.devskiller.sample.CommonsStringProcessor;
import com.devskiller.sample.StringProcessor;

import static org.assertj.core.api.Assertions.assertThat;

class StringProcessorCheckTests {

	@Test
	void shouldAbbreviateNumbers() {
		StringProcessor stringProcessor = new CommonsStringProcessor();
		assertThat(stringProcessor.abbreviate("12345", 4)).isEqualTo("1...");
	}

	@Test
	void shouldAbbreviateToLongString() {
		StringProcessor stringProcessor = new CommonsStringProcessor();
		assertThat(stringProcessor.abbreviate("abcdef", 5)).isEqualTo("ab...");
	}
}