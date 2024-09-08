package com.shop.fruit.repository;

import com.shop.fruit.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member, Long>{
    Member findByEmail(String email);
}
