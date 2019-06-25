package com.volite.ticket.core;

import java.util.Date;

public class Train {
    /**
     * 车次信息
     */
    
   private String trainNumber;
   private String startDate;
   private String endDate;
   private String trainDate;//日期
   private String duration;//历时
   private String startStation;
   private String endStation;
   private String businessSeat;//商务座
   private String firstClassSeat;//一等座
   private String secondClassSeat;//一等座
   private String highSoftBerth;//高级软卧
   private String firstSoftBerth;//一等软卧
   private String movingBerth;//动卧
   private String hardSecondClass;//硬卧二等卧
   private String softSeat;//软座
   private String hardSeat;//硬座
   private String noSeat;//无座
   private String otherSeat;//其他
   private String reserve;//预定
   
   private String Key1;
   private String Key2;
   
   
   

public String getTrainDate() {
    return trainDate;
}
public void setTrainDate(String trainDate) {
    this.trainDate = trainDate;
}
public String getKey1() {
    return Key1;
}
public void setKey1(String key1) {
    Key1 = key1;
}
public String getKey2() {
    return Key2;
}
public void setKey2(String key2) {
    Key2 = key2;
}
public String getTrainNumber() {
    return trainNumber;
}
public void setTrainNumber(String trainNumber) {
    this.trainNumber = trainNumber;
}
public String getStartDate() {
    return startDate;
}
public void setStartDate(String startDate) {
    this.startDate = startDate;
}
public String getEndDate() {
    return endDate;
}
public void setEndDate(String endDate) {
    this.endDate = endDate;
}
public String getDuration() {
    return duration;
}
public void setDuration(String duration) {
    this.duration = duration;
}
public String getStartStation() {
    return startStation;
}
public void setStartStation(String startStation) {
    this.startStation = startStation;
}
public String getEndStation() {
    return endStation;
}
public void setEndStation(String endStation) {
    this.endStation = endStation;
}
public String getBusinessSeat() {
    return businessSeat;
}
public void setBusinessSeat(String businessSeat) {
    this.businessSeat = businessSeat;
}
public String getFirstClassSeat() {
    return firstClassSeat;
}
public void setFirstClassSeat(String firstClassSeat) {
    this.firstClassSeat = firstClassSeat;
}
public String getSecondClassSeat() {
    return secondClassSeat;
}
public void setSecondClassSeat(String secondClassSeat) {
    this.secondClassSeat = secondClassSeat;
}
public String getHighSoftBerth() {
    return highSoftBerth;
}
public void setHighSoftBerth(String highSoftBerth) {
    this.highSoftBerth = highSoftBerth;
}
public String getFirstSoftBerth() {
    return firstSoftBerth;
}
public void setFirstSoftBerth(String firstSoftBerth) {
    this.firstSoftBerth = firstSoftBerth;
}
public String getMovingBerth() {
    return movingBerth;
}
public void setMovingBerth(String movingBerth) {
    this.movingBerth = movingBerth;
}
public String getHardSecondClass() {
    return hardSecondClass;
}
public void setHardSecondClass(String hardSecondClass) {
    this.hardSecondClass = hardSecondClass;
}
public String getSoftSeat() {
    return softSeat;
}
public void setSoftSeat(String softSeat) {
    this.softSeat = softSeat;
}
public String getHardSeat() {
    return hardSeat;
}
public void setHardSeat(String hardSeat) {
    this.hardSeat = hardSeat;
}
public String getNoSeat() {
    return noSeat;
}
public void setNoSeat(String noSeat) {
    this.noSeat = noSeat;
}



public String getOtherSeat() {
    return otherSeat;
}
public void setOtherSeat(String otherSeat) {
    this.otherSeat = otherSeat;
}
public String getReserve() {
    return reserve;
}
public void setReserve(String reserve) {
    this.reserve = reserve;
}
@Override
public String toString() {
    return "Train [trainNumber=" + trainNumber + ", startDate=" + startDate + ", endDate=" + endDate + ", duration="
            + duration + ", startStation=" + startStation + ", endStation=" + endStation + ", businessSeat="
            + businessSeat + ", firstClassSeat=" + firstClassSeat + ", secondClassSeat=" + secondClassSeat
            + ", highSoftBerth=" + highSoftBerth + ", firstSoftBerth=" + firstSoftBerth + ", movingBerth=" + movingBerth
            + ", hardSecondClass=" + hardSecondClass + ", softSeat=" + softSeat + ", hardSeat=" + hardSeat + ", noSeat="
            + noSeat + ", otherSeat=" + otherSeat + ", reserve=" + reserve + ", Key1=" + Key1 + ", Key2=" + Key2 + "]";
}

   
   
 
 
 
   
   
   
   
   
   
   
   
   
   
   
   
    
    
}
