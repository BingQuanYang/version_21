package com.orangelala.www.entity;


import com.orangelala.www.utils.Column;

public class Headlines {
  @Column("h_id")
  private String hId;
  private String headlines;


  public String getHId() {
    return hId;
  }

  public void setHId(String hId) {
    this.hId = hId;
  }


  public String getHeadlines() {
    return headlines;
  }

  public void setHeadlines(String headlines) {
    this.headlines = headlines;
  }

}
