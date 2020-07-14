package com.julio.microservice_user.external.dto.response;

import com.julio.microservice_user.external.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ResponseUserDTO extends ResponseBaseDTO {
    private static final long serialVersionUID = 520043632286326113L;

    private Integer id;
    private String name;
    private String email;

    public ResponseUserDTO(final User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
    }


}
