package com.example.oratest.controller;

import com.example.oratest.dto.TodoDTO;
import com.example.oratest.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/todo")
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @GetMapping("/write")
    public String write(){
        return "todo/write";
    }

    @PostMapping("/write")
    public String write(TodoDTO todoDTO){
        todoService.registerTodo(todoDTO);
        return "redirect:/todo/list";
    }

    @GetMapping("/list")
    public String list(Model model){
        List<TodoDTO> list = todoService.findList();
        model.addAttribute("list", list);
        return "todo/list";
    }
}
