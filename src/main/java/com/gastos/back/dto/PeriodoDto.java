/**
 * 
 */
package com.gastos.back.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tiago
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeriodoDto {
	
	String periodo;
	Boolean abierto;

}
