package com.credibanco.assessment.card.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credibanco.assessment.card.model.Transaccion;

public interface ITransferenciaRepository extends JpaRepository<Transaccion, Integer>{

}
