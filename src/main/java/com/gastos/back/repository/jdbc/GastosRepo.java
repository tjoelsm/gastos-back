/**
 * 
 */
package com.gastos.back.repository.jdbc;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gastos.back.repository.entity.GastoEntity;
import com.gastos.back.repository.entity.pk.GastosEntityPk;

/**
 * @author tiago
 *
 */
public interface GastosRepo extends JpaRepository<GastoEntity, GastosEntityPk>{
	List<GastoEntity> findAllByPk_Periodo(String periodo);
	
	@Query(value = "SELECT MAX(pk.idRegistro)+1 FROM GastoEntity WHERE pk.periodo = ?1")
	Integer getMaxIdRegistroByPeriodo(String periodo);
}
