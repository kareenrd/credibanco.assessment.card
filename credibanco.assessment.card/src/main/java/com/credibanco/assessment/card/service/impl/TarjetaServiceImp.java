package com.credibanco.assessment.card.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.card.model.Tarjeta;
import com.credibanco.assessment.card.repository.ITarjetaRepository;
import com.credibanco.assessment.card.service.ITarjetaService;

@Service
public class TarjetaServiceImp implements ITarjetaService{
	
	@Autowired
	ITarjetaRepository repo;
	
	@Override
	public List<Tarjeta> listar() {
		return repo.findAll();
	}
	@Override
	public Tarjeta crear(Tarjeta tarjeta) {
		return repo.save(tarjeta);
	}
	@Override
	public Tarjeta actualizar(Tarjeta tarjeta) {
		return repo.save(tarjeta);
	}
	@Override
	public void eliminar(Integer idTarjeta) {
		repo.deleteById(idTarjeta);
	}
	@Override
	public Tarjeta ListarId(Integer id) {
		return repo.findById(id).orElse(null);
	}

}
