package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String description;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate createOrEditDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate deadline;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfCompletion;
    private int executionTimeInDays;
    private int executionTimeInHours;
    private int executionTimeInMinutes;
    @Enumerated(value = EnumType.STRING)
    private TaskType type;
    private boolean done;

    public Task() {
    }

    public Long getId() {
        return id;
    }

    public LocalDate getCreateOrEditDate() {
        return createOrEditDate;
    }

    public void setCreateOrEditDate(LocalDate createDate) {
        this.createOrEditDate = createDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public LocalDate getDateOfCompletion() {
        return dateOfCompletion;
    }

    public void setDateOfCompletion(LocalDate dateOfCompletion) {
        this.dateOfCompletion = dateOfCompletion;
    }

    public int getExecutionTimeInDays() {
        return executionTimeInDays;
    }

    public void setExecutionTimeInDays(int executionTimeInDays) {
        this.executionTimeInDays = executionTimeInDays;
    }

    public int getExecutionTimeInHours() {
        return executionTimeInHours;
    }

    public void setExecutionTimeInHours(int executionTimeInHours) {
        this.executionTimeInHours = executionTimeInHours;
    }

    public int getExecutionTimeInMinutes() {
        return executionTimeInMinutes;
    }

    public void setExecutionTimeInMinutes(int executionTimeInMinutes) {
        this.executionTimeInMinutes = executionTimeInMinutes;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
