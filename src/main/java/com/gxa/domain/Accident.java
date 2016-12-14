package com.gxa.domain;

import java.util.Date;

public class Accident {
    private String no;

    private String reason;

    private Date time;

    private String luxian;

    private String accidentreason;

    private String dealreason;

    private String fName;

    private String fPhone;

    private String sName;

    private String sPhone;

    private String dealresult;

    private String beizhu;

    private Date dealtime;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getLuxian() {
        return luxian;
    }

    public void setLuxian(String luxian) {
        this.luxian = luxian == null ? null : luxian.trim();
    }

    public String getAccidentreason() {
        return accidentreason;
    }

    public void setAccidentreason(String accidentreason) {
        this.accidentreason = accidentreason == null ? null : accidentreason.trim();
    }

    public String getDealreason() {
        return dealreason;
    }

    public void setDealreason(String dealreason) {
        this.dealreason = dealreason == null ? null : dealreason.trim();
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName == null ? null : fName.trim();
    }

    public String getfPhone() {
        return fPhone;
    }

    public void setfPhone(String fPhone) {
        this.fPhone = fPhone == null ? null : fPhone.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone == null ? null : sPhone.trim();
    }

    public String getDealresult() {
        return dealresult;
    }

    public void setDealresult(String dealresult) {
        this.dealresult = dealresult == null ? null : dealresult.trim();
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public Date getDealtime() {
        return dealtime;
    }

    public void setDealtime(Date dealtime) {
        this.dealtime = dealtime;
    }
}