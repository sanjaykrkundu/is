package io.github.sanjaykrkundu.is.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Exam {
	@Id
	int id;
	private Quiz quiz;
	private CodingChallenge challenge;
	private Designation designation;
	
}
