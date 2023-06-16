package com.sidharth.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}
