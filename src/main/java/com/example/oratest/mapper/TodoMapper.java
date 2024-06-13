package com.example.oratest.mapper;

import com.example.oratest.dto.TodoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoMapper {
    void insertTodo(TodoDTO todoDTO);

    List<TodoDTO> selectList();
}
