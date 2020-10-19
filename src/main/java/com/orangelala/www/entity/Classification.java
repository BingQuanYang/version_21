package com.orangelala.www.entity;


import com.orangelala.www.utils.Column;

/**
 * kun
 */
public class Classification {

  //id
  @Column("c_id")
  private String cId;
  //分类名
  private String classification;
  //图片
  private String image;


  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }

  public String getcId() {
    return cId;
  }

  public void setcId(String cId) {
    this.cId = cId;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }
}
