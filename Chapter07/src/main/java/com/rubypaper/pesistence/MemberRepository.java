package com.rubypaper.pesistence;

import com.rubypaper.domain.Member;

import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, String> {
    
}
