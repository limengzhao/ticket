package com.volite.ticket.service;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.volite.ticket.communication.Communication;
import com.volite.ticket.core.Train;
import com.volite.ticket.utils.Contants;

public class DataResponse {
    
    public void   ss(){
        String data=Communication.GetConnection (Contants.REQUEST_URL);
        
        System.out.println ("data: "+data);
    }
    
    public static void main(String[] args) {
        String result=Communication.GetConnection (Contants.REQUEST_URL);
        System.out.println ("result01: "+result);
        JSONObject json=JSONObject.parseObject (result);
        String data= json.get ("data").toString ();
        JSONObject jsonData=JSONObject.parseObject (data);
        String text=jsonData.get ("result").toString ();
        text=text.replace ("[" , "").replace ("]" , "").replace ("\"" , "");
        String [] dText=text.split (",");
        Train train=null;
        List<Train> trainList=new ArrayList<Train>();
        for (int i = 0; i < dText.length; i++) {
            train=new Train();
            String[] dTexts=dText[i].split ("\\|");
            for (int j = 0; j < dTexts.length; j++) {
                train.setKey1 (dTexts[0]);
                if(dTexts[3].contains ("G")){
                    train.setTrainNumber (dTexts[3]);
                    train.setStartDate (dTexts[8]);
                    train.setEndDate (dTexts[9]);
                    train.setDuration (dTexts[10]);
                    train.setReserve (dTexts[11]);
                    train.setKey2 (dTexts[12]);
                    train.setTrainDate (dTexts[13]);
                    train.setSecondClassSeat (dTexts[30]);
                    train.setFirstClassSeat (dTexts[31]);
                    train.setBusinessSeat (dTexts[32]);
                }else if(dTexts[3].contains ("Z")){
                    if("Z216".equals (dTexts[3])){
                        System.out.println (dTexts[3]);  
                      }
                    train.setTrainNumber (dTexts[3]);
                    train.setStartDate (dTexts[8]);
                    train.setEndDate (dTexts[9]);
                    train.setDuration (dTexts[10]);
                    train.setReserve (dTexts[11]);
                    train.setKey2 (dTexts[12]);
                    train.setTrainDate (dTexts[13]);
                    train.setNoSeat (dTexts[26]);
                    train.setHardSeat (dTexts[28]);
                    train.setHardSecondClass (dTexts[29]);
                }else if(dTexts[3].contains ("K")){
                    train.setTrainNumber (dTexts[3]);
                    train.setStartDate (dTexts[8]);
                    train.setEndDate (dTexts[9]);
                    train.setDuration (dTexts[10]);
                    train.setReserve (dTexts[11]);
                    train.setKey2 (dTexts[12]);
                    train.setTrainDate (dTexts[13]);
                    train.setNoSeat (dTexts[26]);
                }else if(dTexts[3].contains ("D")){
                    if("D952".equals (dTexts[3])){
                      System.out.println (dTexts[3]);  
                    }
                    train.setTrainNumber (dTexts[3]);
                    train.setStartDate (dTexts[8]);
                    train.setEndDate (dTexts[9]);
                    train.setDuration (dTexts[10]);
                    train.setReserve (dTexts[11]);
                    train.setKey2 (dTexts[12]);
                    train.setTrainDate (dTexts[13]);
                    train.setFirstSoftBerth (dTexts[31]);
                }else if(dTexts[3].contains ("T")){
                    if("T132".equals (dTexts[3])){
                        System.out.println (dTexts[3]);  
                      }
                    train.setTrainNumber (dTexts[3]);
                    train.setStartDate (dTexts[8]);
                    train.setEndDate (dTexts[9]);
                    train.setDuration (dTexts[10]);
                    train.setReserve (dTexts[11]);
                    train.setKey2 (dTexts[12]);
                    train.setTrainDate (dTexts[13]);
                    train.setFirstSoftBerth (dTexts[31]);
                }
                
            }
            trainList.add (train);
        }
        
        
        System.out.println ("result02: "+trainList.toString ());
    }
    
}
