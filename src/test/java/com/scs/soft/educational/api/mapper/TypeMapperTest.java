package com.scs.soft.educational.api.mapper;

import com.scs.soft.educational.api.domain.entity.Type;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TypeMapperTest {

    @Resource
    private TypeMapper typeMapper;

    @Test
    void getAllType() throws SQLException {
        List<Map> typeList = typeMapper.getAllType();
        System.out.println(typeList);
    }
}