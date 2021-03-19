/**
 * 
 */
package com.gastos.back.repository.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gastos.back.repository.entity.TipoGastoEntity;
import com.gastos.back.repository.entity.pk.TipoGastoEntityPk;

/**
 * @author tiago
 *
 */
@Repository
public interface TipoGastosRepo extends JpaRepository<TipoGastoEntity, TipoGastoEntityPk>{

}
