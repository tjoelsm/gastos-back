/**
 * 
 */
package com.gastos.back.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author tiago
 *
 */
@Entity
@Table(name="gt_entidad")
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class EntidadEntity {
	
	@Id
	Integer codEntidad;
	
	String nombre;
	
	String web;

}
