package com.example.DYmall.Member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberForm {
    private Integer num_id;

    private String member_id;

    private String member_pw;

    private String memberName;

    private String member_phone;

    private String member_email;
}
