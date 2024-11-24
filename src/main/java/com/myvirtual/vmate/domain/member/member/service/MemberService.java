package com.myvirtual.vmate.domain.member.member.service;

import com.myvirtual.vmate.domain.member.member.entity.Member;
import com.myvirtual.vmate.domain.member.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
    
    public Optional<Member> findByUserEmail(String useremail) {
        return memberRepository.findByUserEmail(useremail);
    }
}
