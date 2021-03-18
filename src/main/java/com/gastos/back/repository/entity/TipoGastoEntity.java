/**
 * 
 */
package com.gastos.back.repository.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.gastos.back.repository.entity.pk.TipoGastoEntityPk;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author tiago
 *
 */
@Entity
@Table(name="gt_tipogasto")
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class TipoGastoEntity {
	
	@EmbeddedId
	private TipoGastoEntityPk pk;
	
	@Column(name="tipo_gasto")
	private String tipoGasto;
	
	private Boolean activo;
	
	@Column(name="valor_defecto")
	private Double valoDefecto;
	
	@Column(name="fecha_baja")
	private Date fechaBaja;

}
