package com.fast.develop.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 *
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2016年10月27日 下午9:59:27
 */
public class Result extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public Result() {
        put("code", 200);
        put("msg", "操作成功");
    }

    public void setError(String message) {
        put("msg", message);
    }

    public void setError(int code, String message) {
        put("code", code);
        put("msg", message);
    }

    public static Result error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static Result error(String msg) {
        return error(500, msg);
    }

    public static Result paramsError() {
        return error(500, "参数错误");
    }

    public static Result error(int code, String msg) {
        Result r = new Result();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static Result ok(String msg) {
        Result r = new Result();
        r.put("msg", msg);
        return r;
    }

    public static Result ok(Map<String, Object> map) {
        Result r = new Result();
        r.putAll(map);
        return r;
    }

    public static Result ok() {
        return new Result();
    }

    public void setOk() {
        put("code", 0);
        put("msg", "操作成功");
    }

    public static Result result() {
        return new Result();
    }

    public Result put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
