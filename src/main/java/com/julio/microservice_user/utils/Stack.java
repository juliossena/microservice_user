package com.julio.microservice_user.utils;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    List<Integer> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public void stack(final Integer integer) {
        this.list.add(integer);
    }

    public Integer unstack() {
        final Integer returnInteger = new Integer(this.list.get(this.list.size() - 1));
        this.list.remove(this.list.size() - 1);
        return returnInteger;
    }

}
