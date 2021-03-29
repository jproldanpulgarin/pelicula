package co.edu.iudigital.app.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gender") /*nombre tabla*/

public class Gender implements Serializable{
	
	@Id /*atribuye al id int*/
	@Column (name ="gender_id")/*poner la clumna llave primaria*/
	private int id;
	private String name;
	
	/*GETTER Y SETTERS*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
