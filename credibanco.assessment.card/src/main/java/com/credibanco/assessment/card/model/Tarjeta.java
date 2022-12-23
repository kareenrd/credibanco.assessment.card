package com.credibanco.assessment.card.model;

import java.util.Random;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tarjeta")
public class Tarjeta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTarjeta;
	
	@Column(name="pan", length = 19)
	private Integer PAN;
	
	@Column(name="titular")
	private String titular;
	
	@Column(name="cedula", length = 15)
	private Integer cedula;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="telefono", length = 10)
	private Integer telefono;
	
	@Column(name="estado")
	private String estado = "Creada";
	
	@Column(name="codValidacion")
	private Integer codValidacion = (int)(Math.random()*100)+1; 
	
	
	public Integer getCodValidacion() {
		return codValidacion;
	}

	public void setCodValidacion(Integer codValidacion) {
		this.codValidacion = codValidacion;
	}

	public Integer getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(Integer idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public Integer getPAN() {
		return PAN;
	}

	public void setPAN(Integer pAN) {
		PAN = pAN;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
}
