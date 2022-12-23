package com.credibanco.assessment.card.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.credibanco.assessment.card.model.Tarjeta;
import com.credibanco.assessment.card.service.ITarjetaService;

@RestController
@RequestMapping("/tarjeta")
public class TarjetaController {
	
	
	@Autowired
	ITarjetaService service;
	
	@GetMapping
	public ResponseEntity<List<Tarjeta>> listar(){
		List<Tarjeta> obj = service.listar();
		return new ResponseEntity<List<Tarjeta>>(obj, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Tarjeta> crear(@RequestBody Tarjeta tarjeta){
	//public ResponseEntity<Void> crear(@RequestBody Tarjeta tarjeta){
		Tarjeta obj = service.crear(tarjeta);
		return new ResponseEntity<Tarjeta>(obj, HttpStatus.OK);
		//URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdTarjeta()).toUri();
		//return ResponseEntity.created(uri).build();
	}
	
	@PutMapping
	public ResponseEntity<Tarjeta> actualizar(@RequestBody Tarjeta tarjeta){
		Tarjeta obj = service.actualizar(tarjeta);
		return new ResponseEntity<Tarjeta>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
		Tarjeta obj = service.ListarId(id);
		if(obj == null) {
			throw new Exception("No se encontro ID de tarjeta - eliminar");
		}
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Tarjeta> listarId(@PathVariable("id") Integer id) throws Exception{
		Tarjeta obj = service.ListarId(id);
		if(obj == null) {
			throw new Exception("No se encontro ID de tarjeta - listarId");
		}
		return new ResponseEntity<Tarjeta>(obj, HttpStatus.OK);
	}
	

}
