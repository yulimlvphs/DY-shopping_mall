package com.example.DYmall.Member;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@ComponentScan(basePackages = {"com.example.DYmall.Member"})
@Service
@Transactional
public interface MemberService {
    //회원등록
    void insertMember(members member);

    //로그인시 해당 id,pw에 맞는 데이터를 찾음
    public Optional<members> selectOne(String memberId, String memberPw);

    //찾은 데이터의 이름을 반환함.
    public Optional<String> selectOneName(String memberId, String memberPw);
}
