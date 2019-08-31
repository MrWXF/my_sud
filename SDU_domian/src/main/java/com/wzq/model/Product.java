package com.wzq.model;

import com.wzq.utils.DataUtils;
import javafx.scene.chart.PieChart;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.ParseException;
import java.util.Date;

























































/**
 * 商品信息
 */
public class Product {
    private int id; //主键
    private String productNum; //编号
    private String productName;//名称
    private String cityName;//出发城市
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date departureTime;//出发时间
    private String departureTimeStr;
    private  Double productPrice;//产品价格
    private String productStatusStr;//状态 0关闭 1 开启

    public String getDepartureTimeStr() {
        if(departureTime!=null){
            String timeStr = DataUtils.date2String(departureTime, "yyyy-MM-dd HH:mm");
            return timeStr;
        }
        else {
            return "1111111";
        }

    }

    public void setDepartureTimeStr(String departureTimeStr) {
        this.departureTimeStr = departureTimeStr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Date getDepartureTime() {
//        DataUtils.date2String(departureTime,"yyyy-MM-DD HH:mm:ss");
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {

        if(departureTime==null){
//            try {
//                Date date = DataUtils.string2Date(departureTime, "yyyy-MM-DD HH:mm:ss");
//                this.departureTime = date;
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
            this.departureTime =departureTime;
        }

    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductStatusStr() {
        return productStatusStr;
    }

    public void setProductStatusStr(String productStatusStr) {
        this.productStatusStr = productStatusStr;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productNum='" + productNum + '\'' +
                ", productName='" + productName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", departureTime=" + departureTime +
                ", productPrice=" + productPrice +
                ", productStatusStr='" + productStatusStr + '\'' +
                '}';
    }
}
