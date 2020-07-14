package com.julio.microservice_user.external.enums;

public enum Platforms {

    ADMIN(0, "ROLE_ADMIN"), CLIENT(1, "ROLE_CLIENTE");

    private int code;
    private String description;


    private Platforms(final int code, final String description) {
        this.code = code;
        this.description = description;
    }

    public int getCod() {
        return this.code;
    }

    public String getDescricao() {
        return this.description;
    }

    public static Platforms toEnum(final Integer code) {
        if (code == null) {
            return null;
        }

        for (final Platforms x : Platforms.values()) {
            if (code.equals(x.getCod())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + code);
    }
}
