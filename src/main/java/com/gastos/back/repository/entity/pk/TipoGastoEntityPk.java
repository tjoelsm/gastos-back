/**
 * 
 */
package com.gastos.back.repository.entity.pk;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author tiago
 *
 */
@Data
@EqualsAndHashCode
public class TipoGastoEntityPk extends SerialEntityPk{

	@Column(name="cod_tipo_gasto")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer codTipoGasto;
	
	@Column(name="grupo_gasto")
	private Integer grupoGasto;

	
	
}
