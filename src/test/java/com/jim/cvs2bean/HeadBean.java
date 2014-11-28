package com.jim.cvs2bean;

import com.jim.cvs2bean.annotation.Head;

/**
 * JimQiao
 * 2014-11-27 16:37
 */
//  旺旺昵称,中奖标题,姓名,联系方式,固定电话,省,市,区,详细地址
public class HeadBean {
    private String name;
    private String nickName;
    private String title;
    private String buyerName;
    private String mobile;
    private String telephone;
    private String state;
    private String city;
    private String district;
    private String address;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bean{");
        sb.append("name='").append(name).append('\'');
        sb.append(", nickName='").append(nickName).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", buyerName='").append(buyerName).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", telephone='").append(telephone).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", district='").append(district).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Head("旺旺昵称")
    public void setName(String name) {
        this.name = name;
    }

    @Head("旺旺昵称")
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Head("中奖标题")
    public void setTitle(String title) {
        this.title = title;
    }

    @Head("姓名")
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    @Head("联系方式")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Head("固定电话")
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Head("省")
    public void setState(String state) {
        this.state = state;
    }

    @Head("市")
    public void setCity(String city) {
        this.city = city;
    }

    @Head("区")
    public void setDistrict(String district) {
        this.district = district;
    }

    @Head("详细地址")
    public void setAddress(String address) {
        this.address = address;
    }

}
