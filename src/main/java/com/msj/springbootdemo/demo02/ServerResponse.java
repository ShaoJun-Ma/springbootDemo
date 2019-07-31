package com.msj.springbootdemo.demo02;

public class ServerResponse {
    private int status;
    private String msg;
    private Object data;

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    public ServerResponse(int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static ServerResponse createSuccess(Object data){
         return new ServerResponse(200,"ok",data);
    }
}
