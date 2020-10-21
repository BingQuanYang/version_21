package com.orangelala.www.entity;

import com.orangelala.www.utils.Column;

/**
 * 购物车类
 */
public class ShoppingCart {
  private String id;
  //商品的id
  @Column("p_id")
  private String pId;
  //单价
  @Column("unit_price")
  private String unitPrice;
  //数量
  private long number;
  //用户id
  @Column("u_id")
  private String uId;
  //是否有效
  @Column("is_available")
  private long isAvailable;


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


  public String getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }


  public String getUId() {
    return uId;
  }

  public void setUId(String uId) {
    this.uId = uId;
  }


  public long getIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(long isAvailable) {
    this.isAvailable = isAvailable;
  }

  @Override
  public String toString() {
    return "ShoppingCart{" +
            "id='" + id + '\'' +
            ", pId='" + pId + '\'' +
            ", unitPrice=" + unitPrice +
            ", number=" + number +
            ", uId=" + uId +
            ", isAvailable=" + isAvailable +
            '}';
  }
}
