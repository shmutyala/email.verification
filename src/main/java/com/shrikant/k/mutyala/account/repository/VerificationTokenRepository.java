package com.shrikant.k.mutyala.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shrikant.k.mutyala.account.model.VerificationToken;

import java.util.List;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, String> {
    List<VerificationToken> findByUserEmail(String email);
    List<VerificationToken> findByToken(String token);
}
