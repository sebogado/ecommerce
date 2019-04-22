package com.comision6dorrego.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/*
 * Declaro que la clase unidad, sera una entidad y relacionara con una tabla en la base de datos
 * */
@Entity
public class TipoUnidad {

	/*
	 * Declaro el campo id como identificador, que se autogenerara
	 * */
	@Id
	@GeneratedValue
	private Long id;
	/*
	 * Declaro que name no puede ser nulo ni puede estar vacio al momento de realizarse validaciones
	 * */
	@NotNull
	@NotEmpty
	private String name;
	/*
	 * Sobre el campo description no hay validaciones, por lo cual, puede ser tanto null como estar vacio
	 * */
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TipoUnidad that = (TipoUnidad) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(name, that.name) &&
				Objects.equals(description, that.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, description);
	}

	@Override
	public String toString() {
		return "TipoUnidad{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
