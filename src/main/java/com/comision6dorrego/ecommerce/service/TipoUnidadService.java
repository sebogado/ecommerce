package com.comision6dorrego.ecommerce.service;

import com.comision6dorrego.ecommerce.model.TipoUnidad;

import java.util.List;
import java.util.Optional;

public interface TipoUnidadService {
	List<TipoUnidad> findAll();

	Optional<TipoUnidad> findById(Long id);

	void deleteById(Long id);

	TipoUnidad save(TipoUnidad tipoUnidad);
}
