package com.julio.microservice_user.external.dto.request;

import java.io.Serializable;

import lombok.Data;

@Data
public class CredenciaisDTO implements Serializable {
    private static final long serialVersionUID = 5026047881864501193L;

    private String email;
    private String password;

    public CredenciaisDTO() {

    }



}
