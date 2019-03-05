package cn.fan.utils;

import java.io.Serializable;

/**
 * 用于描述业务操作的结果集
 */
public class NoteResult<T> implements Serializable {

    private static final long serialVersionUID = -6772343675510872288L;

    //结果的状态码
    private int status;
    //对返回结果的描述
    private String msg;
    //返回的具体数据
    private T data;

    public NoteResult() {
    }

    public NoteResult(int status, String msg, T data) {

        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public int getStatus() {

        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "NoteResult{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
