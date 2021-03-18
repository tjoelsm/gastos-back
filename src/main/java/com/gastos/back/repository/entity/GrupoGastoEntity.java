/**
 * 
 */
package com.gastos.back.repository.entity;

import javax.persistence.Column;
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
@Table(name="gt_grupogasto")
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class GrupoGastoEntity {
	
	@Id
	@Column(name="cod_grupo")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer codGrupo;
	
	@Column(name="grupo_gasto")
	private String grupoGasto;
	
	private Boolean ahorro;


}
