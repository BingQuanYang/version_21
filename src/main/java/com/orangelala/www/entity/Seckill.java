package com.orangelala.www.entity;


import com.orangelala.www.utils.Column;

public class Seckill {

  private String id;
  @Column("p_id")
  private String pId;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getPId() {
    return pId;
  }

  public void setPId(String pId) {
    this.pId = pId;
  }

  @Override
  public String toString() {
    return "Seckill{" +
            "id='" + id + '\'' +
            ", pId='" + pId + '\'' +
            '}';
  }
}
