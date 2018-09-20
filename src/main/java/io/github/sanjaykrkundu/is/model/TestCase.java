package io.github.sanjaykrkundu.is.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@Entity
public class TestCase {
	@Id
	private int id;
	private String input;
	private String output;
	private boolean defaultTestcase;
	
}
