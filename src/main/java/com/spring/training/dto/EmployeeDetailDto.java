package com.spring.training.dto;


import java.time.LocalDateTime;

public class EmployeeDetailDto {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;
    private Long personalNumericCode;
    private Boolean isHired;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public EmployeeDetailDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getPersonalNumericCode() {
        return personalNumericCode;
    }

    public void setPersonalNumericCode(Long personalNumericCode) {
        this.personalNumericCode = personalNumericCode;
    }

    public Boolean getHired() {
        return isHired;
    }

    public void setHired(Boolean hired) {
        isHired = hired;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
