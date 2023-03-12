package com.example.demo.model.dao;
import com.example.demo.model.dto.exampleDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TestMapper {
    List<exampleDTO> getAllDataList();
}