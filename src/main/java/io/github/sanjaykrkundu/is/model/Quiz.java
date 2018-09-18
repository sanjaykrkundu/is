package io.github.sanjaykrkundu.is.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Quiz extends ExamElement{
	
	Technology technology;
	@ManyToMany
	List<QuizQuestion> questions;
}
