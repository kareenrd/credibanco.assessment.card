package com.credibanco.assessment.card.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="transaccion")
public class Transaccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTransaccion;
	
	@Column(name="tipo")
	private Integer tipo; //1: aprobar, 2: cancelar
	
	@Column(name="fecha")
	private String fecha;
	
	@Column(name="noReferencia")
	private Integer noReferencia;
	
	@Column(name="estado")
	private Integer estado = 1; //1: aprobada, 2:rechazada
	
	@Column(name="total")
	private Integer total;
	
	@Column(name="direccion")
	private String direccion;
	
	@ManyToOne
	@JoinColumn(name="idTarjeta")
	private Tarjeta tarjeta;
	

	public Integer getIdTransaccion() {
		return idTransaccion;
	}

	public void setIdTransaccion(Integer idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Integer getNoReferencia() {
		return noReferencia;
	}

	public void setNoReferencia(Integer noReferencia) {
		this.noReferencia = noReferencia;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

}
