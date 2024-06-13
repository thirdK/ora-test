package com.example.oratest.service;

import com.example.oratest.dto.TodoDTO;
import com.example.oratest.mapper.TodoMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class TodoService {
    private final TodoMapper todoMapper;

    public void registerTodo(TodoDTO todoDTO) {
        todoMapper.insertTodo(todoDTO);
    }

    public List<TodoDTO> findList() {
        return todoMapper.selectList();
    }
}
