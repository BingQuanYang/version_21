package com.orangelala.www.entity;


import com.orangelala.www.utils.Column;

public class Details {

  private String id;//商品id

  @Column("product_type")
  private String productType;//产品类型

  @Column("producing_area")
  private String producingArea;//原料产地

  private String area;//产地

  @Column("burden_sheet")
  private String burdenSheet;//配料表

  @Column("product_specifications")
  private String productSpecifications;//产品规格

  @Column("shelf_life")
  private String shelfLife;//保质期

  @Column("ps_code")
  private String psCode;//产品标准号

  @Column("pl_number")
  private String plNumber;//生产许可证编号

  private String storages;//存储方法

  @Column("eat_method")
  private String eatMethod;//食用方法

  private String image;//图片

  @Column("is_delete")
  private String isDelete;//拟删除


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }


  public String getProducingArea() {
    return producingArea;
  }

  public void setProducingArea(String producingArea) {
    this.producingArea = producingArea;
  }


  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }


  public String getBurdenSheet() {
    return burdenSheet;
  }

  public void setBurdenSheet(String burdenSheet) {
    this.burdenSheet = burdenSheet;
  }


  public String getProductSpecifications() {
    return productSpecifications;
  }

  public void setProductSpecifications(String productSpecifications) {
    this.productSpecifications = productSpecifications;
  }


  public String getShelfLife() {
    return shelfLife;
  }

  public void setShelfLife(String shelfLife) {
    this.shelfLife = shelfLife;
  }


  public String getPsCode() {
    return psCode;
  }

  public void setPsCode(String psCode) {
    this.psCode = psCode;
  }


  public String getPlNumber() {
    return plNumber;
  }

  public void setPlNumber(String plNumber) {
    this.plNumber = plNumber;
  }


  public String getStorages() {
    return storages;
  }

  public void setStorages(String storages) {
    this.storages = storages;
  }


  public String getEatMethod() {
    return eatMethod;
  }

  public void setEatMethod(String eatMethod) {
    this.eatMethod = eatMethod;
  }


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public String getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(String isDelete) {
    this.isDelete = isDelete;
  }

}
