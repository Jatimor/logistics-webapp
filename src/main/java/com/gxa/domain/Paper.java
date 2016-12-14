package com.gxa.domain;

import java.util.Date;

public class Paper {
    private String tuoNo;

    private String status;

    private String realname;

    private Date time;

    private String beizhu;

    private String jiaopiao;

    private String shoupiao;

    public String getTuoNo() {
        return tuoNo;
    }

    public void setTuoNo(String tuoNo) {
        this.tuoNo = tuoNo == null ? null : tuoNo.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public String getJiaopiao() {
        return jiaopiao;
    }

    public void setJiaopiao(String jiaopiao) {
        this.jiaopiao = jiaopiao == null ? null : jiaopiao.trim();
    }

    public String getShoupiao() {
        return shoupiao;
    }

    public void setShoupiao(String shoupiao) {
        this.shoupiao = shoupiao == null ? null : shoupiao.trim();
    }
}