package com.gtwo.bdss_system.service.auth;

import com.gtwo.bdss_system.dto.auth.AccountResponse;
import com.gtwo.bdss_system.dto.auth.ForgotPasswordRequest;
import com.gtwo.bdss_system.dto.auth.LoginRequest;
import com.gtwo.bdss_system.dto.auth.RegisterRequest;
import com.gtwo.bdss_system.entity.auth.Account;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AuthenticationService extends UserDetailsService {
    Account register(RegisterRequest dto);
    AccountResponse login(LoginRequest loginRequest);
    UserDetails loadUserByUsername(String email);
    void forgotPassword(ForgotPasswordRequest request);
    void resetPassword(String token, String newPassword);
}
