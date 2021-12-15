package com.auiz1.sheryarali.projectxmls;

public class blogs {
    String img;
    String title;
    String msg;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public blogs(String img, String title, String msg) {
        this.img = img;
        this.title = title;
        this.msg = msg;
    }
}
