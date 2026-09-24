package com.example.employee.dto;

public class EmployeeResponse {

    private Long id;

    private String name;

    private String email;

    private String department;

    private Double salary;

    private String city;

    public EmployeeResponse() {
    }

    public EmployeeResponse(Long id,
                            String name,
                            String email,
                            String department,
                            Double salary,
                            String city) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.salary = salary;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }
}