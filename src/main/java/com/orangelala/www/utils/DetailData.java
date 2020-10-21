package com.orangelala.www.utils;

import com.orangelala.www.entity.Details;
import com.orangelala.www.entity.Img;
import com.orangelala.www.entity.Information;

import java.util.List;

public class DetailData {
    public Information infor;
    public Details details;
    public List<Img> img;

    public Information getInfor() {
        return infor;
    }

    public void setInfor(Information infor) {
        this.infor = infor;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public List<Img> getImg() {
        return img;
    }

    public void setImg(List<Img> img) {
        this.img = img;
    }
}
