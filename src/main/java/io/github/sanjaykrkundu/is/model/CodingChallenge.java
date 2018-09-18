package io.github.sanjaykrkundu.is.model;

import java.util.List;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class CodingChallenge extends ExamElement {
	
	List<ProgrammingQuestion> questions;
}
