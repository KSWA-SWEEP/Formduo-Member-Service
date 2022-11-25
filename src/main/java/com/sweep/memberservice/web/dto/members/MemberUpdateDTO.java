package com.sweep.memberservice.web.dto.members;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberUpdateDTO {
    private String email;
    private String password;
    private String username;
//    private List<String> authorities;

}
