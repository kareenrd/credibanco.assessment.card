package com.credibanco.assessment.card.service;

import java.util.List;

import com.credibanco.assessment.card.model.Tarjeta;

public interface ITarjetaService {
	
	List<Tarjeta> listar();
	
	Tarjeta crear(Tarjeta tarjeta);
	
	Tarjeta actualizar(Tarjeta tarjeta);
	
	void eliminar(Integer idTarjeta);
	
	Tarjeta ListarId(Integer id);

}
