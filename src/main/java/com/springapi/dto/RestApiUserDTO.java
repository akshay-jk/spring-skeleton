package com.springapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestApiUserDTO {
    private int id;
    private String name;
    private String username;
    private String phone;
    private String website;
}
