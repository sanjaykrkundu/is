package io.github.sanjaykrkundu.is.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExamElement {
	@Id
	int id;
	int noOfQuestion;
	int time;
	int fullMark;
}
