package com.comision6dorrego.ecommerce.service.impl;

import com.comision6dorrego.ecommerce.dao.TypoUnidadDao;
import com.comision6dorrego.ecommerce.model.TipoUnidad;
import com.comision6dorrego.ecommerce.service.TipoUnidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
 *
 * Declaro que esta implementacion de la interfaz tipo de unidad, es un service y voy a poder inyectarlo como dependencia
 * */
@Service
public class TipoUnidadServiceImpl implements TipoUnidadService {

	/*
	 * Inyecto el tipo de unidad dao como dependencia de la clase tipo unidad service impl
	 * */
	@Autowired
	private TypoUnidadDao tipoUnidadDao;

	@Override
	public List<TipoUnidad> findAll() {
		return tipoUnidadDao.findAll();
	}

	@Override
	public Optional<TipoUnidad> findById(Long id) {
		return tipoUnidadDao.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		tipoUnidadDao.deleteById(id);
	}

	@Override
	public TipoUnidad save(TipoUnidad tipoUnidad) {
		return tipoUnidadDao.save(tipoUnidad);
	}
}
