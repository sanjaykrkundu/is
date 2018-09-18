package io.github.sanjaykrkundu.is.value;

import lombok.Getter;

@Getter
public enum Level {
	BEGINNER(1), INTERMEDIATE(2), ADVANCED(3);

	private int value;

	Level(int val) {
		value = val;
	}

}
