package io.github.sanjaykrkundu.is.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import io.github.sanjaykrkundu.is.value.Level;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class QuizQuestion {
	@Id
	private int id;
	private String question;
	private String o1, o2, o3, o4;
	private char annswer;
	@OneToOne
	private Technology technology;
	private Level level;
	private boolean mendatory;
	private boolean active;
}
