/**
 * 
 */
package com.gastos.back.repository.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gastos.back.repository.entity.GrupoGastoEntity;

/**
 * @author tiago
 *
 */
public interface GrupoGastosRepo extends JpaRepository<GrupoGastoEntity, Integer>{

}
