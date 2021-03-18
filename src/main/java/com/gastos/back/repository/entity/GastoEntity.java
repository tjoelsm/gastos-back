/**
 * 
 */
package com.gastos.back.repository.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.gastos.back.repository.entity.pk.GastosEntityPk;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author tiago
 *
 */
@Entity
@Table(name="gt_gastos")
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class GastoEntity {
	
	@EmbeddedId
	private GastosEntityPk pk;	
	private Double importe;
	private Date fecha;
}
