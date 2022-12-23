package com.credibanco.assessment.card.service;

import java.util.List;

import com.credibanco.assessment.card.model.Transaccion;

public interface ITransaccionService {
	
	List<Transaccion> listar();
		
	Transaccion crear(Transaccion tarjeta);
		
	Transaccion actualizar(Transaccion tarjeta);
		
	void eliminar(Integer idTarjeta);
	
	Transaccion ListarId(Integer id);

}
