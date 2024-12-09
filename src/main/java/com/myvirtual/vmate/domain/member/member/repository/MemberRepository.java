package com.myvirtual.vmate.domain.member.member.repository;

import com.myvirtual.vmate.domain.member.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUserEmail(String username);

    Optional<Member> findByRefreshToken(String refreshToken);
}