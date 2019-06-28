package com.devskiller.sample;

import org.apache.commons.lang3.StringUtils;

public class CommonsStringProcessor implements StringProcessor {

	@Override
	public String abbreviate(String input, int maxLength) {
		String correctResult = StringUtils.abbreviate(input, maxLength);
		return correctResult + correctResult;
	}

}
