package com.example.DYmall.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Optional;

@ComponentScan(basePackages = {"com.example.DYmall.Member"})
@Repository
@Transactional
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberRepository repository;

    @Override
    public void insertMember(members member) {
        System.out.print("lmpl 실행중");
        repository.save(member);
    }

    @Override
    public Optional<members> selectOne(String memberId, String memberPw) {
        return Optional.ofNullable(repository.findByMemberIdAndMemberPw(memberId, memberPw));
    }

    @Override
    public Optional<String> selectOneName(String memberId, String memberPw) {
        Optional<members> member = selectOne(memberId, memberPw);
        return member.map(members::getMemberName);
    }
}
