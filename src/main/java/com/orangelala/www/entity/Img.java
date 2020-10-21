package com.orangelala.www.entity;


import com.orangelala.www.utils.Column;

public class Img {

  //主键
  private long id;
  //外键
  @Column("p_id")
  private String pId;
  //图片
  private String image;
  //拟删除
  @Column("is_del")
  private long isDel;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getPId() {
    return pId;
  }

  public void setPId(String pId) {
    this.pId = pId;
  }


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public long getIsDel() {
    return isDel;
  }

  public void setIsDel(long isDel) {
    this.isDel = isDel;
  }

  @Override
  public String toString() {
    return "Img{" +
            "id=" + id +
            ", pId='" + pId + '\'' +
            ", image='" + image + '\'' +
            ", isDel=" + isDel +
            '}';
  }
}
