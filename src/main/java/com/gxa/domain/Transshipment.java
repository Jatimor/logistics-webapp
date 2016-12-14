package com.gxa.domain;

public class Transshipment {
    private String company;

    private String lawpeople;

    private String address;

    private String code;

    private String status;

    private String fPhone;

    private String contactpeople;

    private String lPhone;

    private String 部门;

    private String zhiwu;

    private String fax;

    private String eMail;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getLawpeople() {
        return lawpeople;
    }

    public void setLawpeople(String lawpeople) {
        this.lawpeople = lawpeople == null ? null : lawpeople.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getfPhone() {
        return fPhone;
    }

    public void setfPhone(String fPhone) {
        this.fPhone = fPhone == null ? null : fPhone.trim();
    }

    public String getContactpeople() {
        return contactpeople;
    }

    public void setContactpeople(String contactpeople) {
        this.contactpeople = contactpeople == null ? null : contactpeople.trim();
    }

    public String getlPhone() {
        return lPhone;
    }

    public void setlPhone(String lPhone) {
        this.lPhone = lPhone == null ? null : lPhone.trim();
    }

    public String get部门() {
        return 部门;
    }

    public void set部门(String 部门) {
        this.部门 = 部门 == null ? null : 部门.trim();
    }

    public String getZhiwu() {
        return zhiwu;
    }

    public void setZhiwu(String zhiwu) {
        this.zhiwu = zhiwu == null ? null : zhiwu.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }
}