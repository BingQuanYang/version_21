package com.orangelala.www.entity;


import com.orangelala.www.utils.Column;

public class Information {


  private String id;//商品id
  private String image;//图片
  @Column("p_id")
  private long pId;//商品名字
  @Column("shop_discount")
  private String shopDiscount;//商品店铺优惠
  @Column("promotiom_price")
  private double promotiomPrice;//商品促销价
  @Column("original_price")
  private double originalPrice;//商品原价
  private String address;//商品地址
  private String freight;//商品快递费
  @Column("monthly_sales")
  private String monthlySales;//商品月销量
  @Column("cumulative_sales")
  private String cumulativeSales;//商品累积销量
  @Column("cumulative_evaluation")
  private String cumulativeEvaluation;//商品累积评价
  private String stock;//商品库存


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public long getPId() {
    return pId;
  }

  public void setPId(long pId) {
    this.pId = pId;
  }


  public String getShopDiscount() {
    return shopDiscount;
  }

  public void setShopDiscount(String shopDiscount) {
    this.shopDiscount = shopDiscount;
  }


  public double getPromotiomPrice() {
    return promotiomPrice;
  }

  public void setPromotiomPrice(double promotiomPrice) {
    this.promotiomPrice = promotiomPrice;
  }


  public double getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(double originalPrice) {
    this.originalPrice = originalPrice;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getFreight() {
    return freight;
  }

  public void setFreight(String freight) {
    this.freight = freight;
  }


  public String getMonthlySales() {
    return monthlySales;
  }

  public void setMonthlySales(String monthlySales) {
    this.monthlySales = monthlySales;
  }


  public String getCumulativeSales() {
    return cumulativeSales;
  }

  public void setCumulativeSales(String cumulativeSales) {
    this.cumulativeSales = cumulativeSales;
  }


  public String getCumulativeEvaluation() {
    return cumulativeEvaluation;
  }

  public void setCumulativeEvaluation(String cumulativeEvaluation) {
    this.cumulativeEvaluation = cumulativeEvaluation;
  }


  public String getStock() {
    return stock;
  }

  public void setStock(String stock) {
    this.stock = stock;
  }

}
