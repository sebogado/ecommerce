package com.comision6dorrego.ecommerce.dao;

import com.comision6dorrego.ecommerce.model.TipoUnidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TypoUnidadDao extends JpaRepository<TipoUnidad, Long> {

	Optional<TipoUnidad> findById(Long id);

}
