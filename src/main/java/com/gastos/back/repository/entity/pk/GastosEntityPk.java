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
public class GastosEntityPk extends SerialEntityPk{

	@Column(name="id_registro")
	private Integer idRegistro;
	
	@Column(name="cod_tipo_gasto")
	private Integer codTipoGasto;

	private String periodo;
	
}
