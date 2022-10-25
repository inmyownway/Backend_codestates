package com.example.springapi.member;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/v1/members")

    public class MemberController {
    @PostMapping
    public ResponseEntity postMember(@RequestBody MemberDto memberDto)
    {
        return new ResponseEntity<MemberDto>(memberDto, HttpStatus.CREATED);
    }


    @GetMapping("/{member-id}")
    public String getMember(@PathVariable("member-id")long memberId) {
        System.out.println("# memberId: " + memberId);

        // not implementation
        return null;
    }

    @GetMapping
    public String getMembers() {
        System.out.println("# get Members");

        // not implementation
        return null;
    }
}
