package com.example.demo.service;
import com.example.demo.model.dao.TestMapper;
import com.example.demo.model.dto.exampleDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    TestMapper testMapper;

    public List<exampleDTO> getAllDataList() {
        return testMapper.getAllDataList();
    }
}