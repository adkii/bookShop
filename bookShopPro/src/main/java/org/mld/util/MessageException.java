package org.mld.util;
public class MessageException extends Exception {
    private String msg;

    public MessageException() {
        super();
    }

    public MessageException(String msg) {
        super();
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
