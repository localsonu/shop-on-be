package com.onshop.dtos;

import com.onshop.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id ;
    private String userName;
    private String email;
    private UserRole userRole;
    private String password;

}
