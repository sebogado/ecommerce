package com.comision6dorrego.ecommerce.web.controller;

import com.comision6dorrego.ecommerce.model.TipoUnidad;
import com.comision6dorrego.ecommerce.service.TipoUnidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/*
 * Declaro que el tipo de unidad controller puede ser accedido desde /tipo-unidad
 * */
@Controller
@RequestMapping("/tipo-unidad")
public class TipoUnidadController {
	private static final String SHOW_MODAL = "showModal";
	private static final String TIPO_UNIDAD = "tipoUnidad";
	private static final String TIPO_UNIDADES = "tipoUnidades";
	@Autowired
	private TipoUnidadService tipoUnidadService;

	@GetMapping
	public String getTipoUnidades(Model model) {
		model.addAttribute("showModal", false);
		return "tipoUnidad/home";
	}

	@GetMapping("/nuevo")
	public String getNuevoTipoUnidades(Model model) {
		model.addAttribute("showModal", true);
		return "tipoUnidad/home";
	}

	@GetMapping("/edit/{id}")
	public String getEditTipoUnidades(@PathVariable("id") @NotNull Long id, Model model) {
		model.addAttribute(TIPO_UNIDAD, tipoUnidadService.findById(id).orElse(new TipoUnidad()));
		model.addAttribute(SHOW_MODAL, true);
		return "tipoUnidad/home";
	}

	@PostMapping("/delete/{id}")
	public String deleteTipoUnidad(@PathVariable("id") @NotNull Long id, Model model) {
		tipoUnidadService.deleteById(id);
		model.addAttribute("showModal", false);
		return "tipoUnidad/home";
	}

	@PostMapping("/nuevo")
	public String createTipoUnidad(@ModelAttribute("tipoUnidad") @Valid TipoUnidad tipoUnidad, Model model) {
		tipoUnidadService.save(tipoUnidad);
		model.addAttribute(SHOW_MODAL, false);
		return "tipoUnidad/home";
	}

	@ModelAttribute(TIPO_UNIDAD)
	public TipoUnidad getTalle() {
		return new TipoUnidad();
	}

	@ModelAttribute(TIPO_UNIDADES)
	public List<TipoUnidad> getTalles() {
		return this.tipoUnidadService.findAll();
	}

}
