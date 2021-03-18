/**
 * 
 */
package com.gastos.back.repository.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gastos.back.repository.entity.EntidadEntity;

/**
 * @author tiago
 *
 */
public interface EntidadRepo extends JpaRepository<EntidadEntity, Integer>{

}
