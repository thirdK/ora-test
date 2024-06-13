package com.example.oratest.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Getter @Setter @ToString
public class TodoDTO {
    private Long todoId;
    private String content;
    private LocalDate todoDate;
    private boolean finished;
}
