package com.upskills.ems.service;

import com.upskills.ems.dtos.LoginRequestDto;
import com.upskills.ems.dtos.LoginResponseDto;
import com.upskills.ems.dtos.RegisterRequestDto;

public interface AuthService {
    String register(RegisterRequestDto request);
    LoginResponseDto login(LoginRequestDto request);
}

