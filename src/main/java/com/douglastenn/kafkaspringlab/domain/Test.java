package com.douglastenn.kafkaspringlab.domain;

import javax.validation.constraints.NotNull;

public class Test {

    @NotNull
    public String message;

    public Test() {
        //empty
    }

    public Test(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test = (Test) o;

        return message != null ? message.equals(test.message) : test.message == null;
    }

    @Override
    public int hashCode() {
        return message != null ? message.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Test{" +
                "message='" + message + '\'' +
                '}';
    }
}
