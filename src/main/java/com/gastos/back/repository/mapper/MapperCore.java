/**
 * 
 */
package com.gastos.back.repository.mapper;

import java.util.List;

/**
 * @author tiago
 *
 */
public interface MapperCore <D,E>{

    /**
     * To entity.
     *
     * @param source
     *            the source
     * @return the e
     */
    E toEntity(D source);

    /**
     * To dto.
     *
     * @param source
     *            the source
     * @return the d
     */
    D toDto(E source);

    /**
     * To entity.
     *
     * @param source
     *            the source
     * @return the list
     */
    List<E> toEntity(List<D> source);

    /**
     * To dto.
     *
     * @param source
     *            the source
     * @return the list
     */
    List<D> toDto(List<E> source);
	
}
