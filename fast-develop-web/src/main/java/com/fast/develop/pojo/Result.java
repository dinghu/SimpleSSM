package com.fast.develop.pojo;

import java.io.Serializable;
import java.util.HashMap;

public class Result implements Serializable {
    int code;
    String message;
    HashMap<String, Object> data;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }

    public Result() {
        this(200, "操作成功");
    }

    public static Result OK() {
        return new Result(200, "操作成功");
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
