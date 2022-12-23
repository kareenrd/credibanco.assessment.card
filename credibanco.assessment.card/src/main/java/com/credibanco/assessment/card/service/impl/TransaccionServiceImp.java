package com.credibanco.assessment.card.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.card.model.Transaccion;
import com.credibanco.assessment.card.repository.ITransferenciaRepository;
import com.credibanco.assessment.card.service.ITransaccionService;

@Service
public class TransaccionServiceImp implements ITransaccionService{

	
	@Autowired
	ITransferenciaRepository repo;
	
	@Override
	public List<Transaccion> listar() {
		return repo.findAll();
	}

	@Override
	public Transaccion crear(Transaccion tarjeta) {
		return repo.save(tarjeta);
	}

	@Override
	public Transaccion actualizar(Transaccion tarjeta) {
		return repo.save(tarjeta);
	}

	@Override
	public void eliminar(Integer idTarjeta) {
		repo.deleteById(idTarjeta);
		
	}

	@Override
	public Transaccion ListarId(Integer id) {
		return repo.findById(id).orElse(null);
	}

}
