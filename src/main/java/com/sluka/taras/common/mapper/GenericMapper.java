package com.sluka.taras.common.mapper;


public interface GenericMapper<T, V> {
    V toDto(T entity);

    T toEntity(V dto);

}