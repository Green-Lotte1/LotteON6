package com.example.kmarket.mapper;


import com.example.kmarket.dto.KmProductCate2DTO;
import com.example.kmarket.entity.KmProductCate2Entity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KmProductCate2Mapper {
    public KmProductCate2DTO toDTO(KmProductCate2Entity articleEntity);
    public KmProductCate2Entity toEntity(KmProductCate2DTO articleDTO);
}

