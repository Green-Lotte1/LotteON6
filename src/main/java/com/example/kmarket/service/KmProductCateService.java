package com.example.kmarket.service;

import com.example.kmarket.dto.KmProductCate1DTO;
import com.example.kmarket.dto.KmProductCate2DTO;
import com.example.kmarket.mapper.KmProductCate1Mapper;
import com.example.kmarket.mapper.KmProductCate2Mapper;
import com.example.kmarket.repository.KmProductCate1Repository;
import com.example.kmarket.repository.KmProductCate2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KmProductCateService {
    @Autowired
    private KmProductCate1Repository cate1Repository;
    @Autowired
    private KmProductCate2Repository cate2Repository;

    @Autowired
    private KmProductCate1Mapper cate1Mapper;
    @Autowired
    private KmProductCate2Mapper cate2Mapper;
    public List<KmProductCate1DTO> getCate1() {
        return cate1Repository.findAll().stream().map(cate1Mapper::toDTO).toList();
    }
    public List<KmProductCate2DTO> getCate2() {
        return cate2Repository.findAll().stream().map(cate2Mapper::toDTO).toList();
    }

}
