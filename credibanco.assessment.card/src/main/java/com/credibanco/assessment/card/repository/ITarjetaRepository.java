package com.credibanco.assessment.card.repository;

import org.springframework.data.jpa.repository.*;
import com.credibanco.assessment.card.model.Tarjeta;


public interface ITarjetaRepository extends JpaRepository<Tarjeta, Integer>{

}
