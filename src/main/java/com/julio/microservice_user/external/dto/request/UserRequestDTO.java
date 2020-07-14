package com.julio.microservice_user.external.dto.request;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class UserRequestDTO implements Serializable {
    private static final long serialVersionUID = 5026047881864501193L;

    private String email;
    private String password;
    private String name;
    private List<Integer> platforms;

    public UserRequestDTO() {

    }



}
