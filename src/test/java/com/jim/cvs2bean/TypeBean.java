package com.jim.cvs2bean;

/**
 * JimQiao
 * 2014-11-27 16:37
 */
public class TypeBean {
    private int rowNum;
    private boolean result;
    private String nickName;
    private String address;
    private int regionId;
    private int zipCode;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TypeBean{");
        sb.append("rowNum=").append(rowNum);
        sb.append(", result=").append(result);
        sb.append(", nickName='").append(nickName).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", regionId=").append(regionId);
        sb.append(", zipCode=").append(zipCode);
        sb.append('}');
        return sb.toString();
    }

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
