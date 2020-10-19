package com.orangelala.www.entity;


import com.orangelala.www.utils.Column;

public class User {
  //id
  private String id;
  //昵称
  @Column("nick_name")
  private String nickName;
  //姓名
  private String username;
  //性别
  private String sex;
  //生日
  private java.sql.Date birthday;
  //电话号码
  @Column("telephone_number")
  private String telephoneNumber;
  //邮箱
  private String email;
  //登录密码
  @Column("login_password")
  private String loginPassword;
  //支付密码
  @Column("payment_password")
  private String paymentPassword;
  //身份证号
  @Column("id_number")
  private String idNumber;
  //头像
  @Column("head_portrait")
  private String headPortrait;
  //是否有效
  @Column("is_available")
  private long isAvailable;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public java.sql.Date getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Date birthday) {
    this.birthday = birthday;
  }


  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getLoginPassword() {
    return loginPassword;
  }

  public void setLoginPassword(String loginPassword) {
    this.loginPassword = loginPassword;
  }

  public String getPaymentPassword() {
    return paymentPassword;
  }

  public void setPaymentPassword(String paymentPassword) {
    this.paymentPassword = paymentPassword;
  }

  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }

  public String getHeadPortrait() {
    return headPortrait;
  }

  public void setHeadPortrait(String headPortrait) {
    this.headPortrait = headPortrait;
  }

  public long getIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(long isAvailable) {
    this.isAvailable = isAvailable;
  }

  @Override
  public String toString() {
    return "User{" +
            "id='" + id + '\'' +
            ", nickName='" + nickName + '\'' +
            ", username='" + username + '\'' +
            ", sex='" + sex + '\'' +
            ", birthday=" + birthday +
            ", telephoneNumber='" + telephoneNumber + '\'' +
            ", email='" + email + '\'' +
            ", loginPassword='" + loginPassword + '\'' +
            ", paymentPassword='" + paymentPassword + '\'' +
            ", idNumber='" + idNumber + '\'' +
            ", headPortrait='" + headPortrait + '\'' +
            ", isAvailable=" + isAvailable +
            '}';
  }
}
