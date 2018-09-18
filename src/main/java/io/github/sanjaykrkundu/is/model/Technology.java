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
public class Technology {
	@Id
	private int id;
	private String tech;
	private boolean active;
}
