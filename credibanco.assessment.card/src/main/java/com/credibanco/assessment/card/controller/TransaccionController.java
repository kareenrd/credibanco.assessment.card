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

import com.credibanco.assessment.card.model.Transaccion;
import com.credibanco.assessment.card.service.ITransaccionService;

@RestController
@RequestMapping("/transaccion")
public class TransaccionController {
	
	@Autowired
	ITransaccionService service;
	
	@GetMapping
	public ResponseEntity<List<Transaccion>> listar(){
		List<Transaccion> obj = service.listar();
		return new ResponseEntity<List<Transaccion>>(obj, HttpStatus.OK);
	}
	
	@PostMapping
	//public ResponseEntity<Transaccion> crear(@RequestBody Transaccion transaccion){
	public ResponseEntity<Void> crear(@RequestBody Transaccion transaccion){
		Transaccion obj = service.crear(transaccion);
		//return new ResponseEntity<Tarjeta>(obj, HttpStatus.OK);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdTransaccion()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping
	public ResponseEntity<Transaccion> actualizar(@RequestBody Transaccion transaccion){
		Transaccion obj = service.actualizar(transaccion);
		return new ResponseEntity<Transaccion>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
		Transaccion obj = service.ListarId(id);
		if(obj == null) {
			throw new Exception("No se encontro ID de transaccion - eliminar");
		}
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Transaccion> listarId(@PathVariable("id") Integer id) throws Exception{
		Transaccion obj = service.ListarId(id);
		if(obj == null) {
			throw new Exception("No se encontro ID de transaccion - listarId");
		}
		return new ResponseEntity<Transaccion>(obj, HttpStatus.OK);
	}
	
	
	

}
