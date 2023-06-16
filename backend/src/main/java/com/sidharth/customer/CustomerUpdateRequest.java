package com.sidharth.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
