package com.example.DYmall.Member;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@ComponentScan(basePackages = {"com.example.DYmall.Member"})
@Repository
public interface MemberRepository extends JpaRepository<members,Integer> {
    //Spring Data JPA에서 제공하는 메소드 이름 규칙에 맞추어 작성된 read기능
    members findByMemberIdAndMemberPw(String memberId, String memberPw);
}
