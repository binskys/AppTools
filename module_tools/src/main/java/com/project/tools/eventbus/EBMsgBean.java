package com.project.tools.eventbus;

/**
 * @author by benny
 * @date 2020/2/13 16:30
 * @desc EventBusMsg 消息
 */

public class EBMsgBean {
    private int type;
    private String text;
    private int code;
    private Object bean;

    public EBMsgBean(int type) {
        this.type = type;
    }

    public EBMsgBean(int type, String text) {
        this.type = type;
        this.text = text;
    }

    public EBMsgBean(int type, int code) {
        this.type = type;
        this.code = code;
    }

    public EBMsgBean(int type, Object bean) {
        this.type = type;
        this.bean = bean;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    @Override
    public String toString() {
        return "EBMsgBean{" +
                "type=" + type +
                ", text='" + text + '\'' +
                ", code=" + code +
                ", bean=" + bean +
                '}';
    }
}
