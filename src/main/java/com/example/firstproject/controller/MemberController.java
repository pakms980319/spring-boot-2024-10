package com.example.firstproject.controller;

import com.example.firstproject.dto.MemberForm;
import com.example.firstproject.entity.Member;
import com.example.firstproject.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/signup")
    public String signUpPage() {
        return "members/new";
    }

    @PostMapping("/join")
    public String joinMember(MemberForm memberForm) {
        System.out.println("memberForm: " + memberForm.toString());
        Member member = memberForm.toEntity();
        System.out.println("Entity member: " + member.toString());
        Member savedMember = memberRepository.save(member);
        System.out.println("Saved Entity member: " + savedMember.toString());

        return "";
    }
}
