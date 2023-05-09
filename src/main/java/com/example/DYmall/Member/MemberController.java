package com.example.DYmall.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.lang.reflect.Member;
import java.util.Optional;

@Controller
@Configuration
@RequestMapping("/join")
public class MemberController {
    @Autowired
    @Qualifier("memberServiceImpl")
    MemberService service;

    @GetMapping
    public String start(Model model){ //index.html 페에지에서 회원가입 페이지로 넘어가기 위한 매핑
        model.addAttribute("MemberForm", new MemberForm());
        return "join";
    }

    @GetMapping("/in")
    public String LoginIn(Model model){ //index.html 페에지에서 로그인 페이지로 넘어가기 위한 매핑
        model.addAttribute("MemberForm", new MemberForm());
        return "Login";
    }

    @GetMapping("/login")
    public String login(@RequestParam("memberId") String memberId, @RequestParam("memberPw") String memberPw, Model model) {
        String username = service.selectOneName(memberId, memberPw).orElse("Guest");
        model.addAttribute("username", username);
        return "index";
    }

    @GetMapping("/insert")
    public String insert(@Validated MemberForm memberForm, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes){
        members members = new members();
        members.setMemberId(memberForm.getMember_id());
        members.setMemberPw(memberForm.getMember_pw());
        members.setMemberName(memberForm.getMemberName());
        members.setMemberPhone(memberForm.getMember_phone());
        members.setMemberEmail(memberForm.getMember_email());

        //입력체크
        if(!bindingResult.hasErrors()){
            service.insertMember(members);
            redirectAttributes.addFlashAttribute("complete", "등록이 완료되었습니다.");
            return "redirect:/join";
        }
        else {
            //에러가 발생한 경우에는 목록 표시로 변경
            return "redirect:/join/insert";
        }
    }

    public void showList(MemberForm memberForm, Model model){

    }

}
