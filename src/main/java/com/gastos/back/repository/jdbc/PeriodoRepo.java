/**
 * 
 */
package com.gastos.back.repository.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gastos.back.repository.entity.PeriodoEntity;

/**
 * @author tiago
 *
 */
public interface PeriodoRepo extends JpaRepository<PeriodoEntity, String>{

	PeriodoEntity findByAbierto(Boolean estado);
}
