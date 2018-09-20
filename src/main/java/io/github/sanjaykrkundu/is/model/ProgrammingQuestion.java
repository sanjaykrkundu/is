package io.github.sanjaykrkundu.is.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@Entity
public class ProgrammingQuestion {
	@Id
	private int id;
	private String question;
	@OneToMany
	private List<TestCase> testcases;
	private boolean mendatory;
	private boolean active;
}
