package com.volite.ticket.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import com.volite.ticket.communication.Communication;
import com.volite.ticket.utils.Contants;

public class StationNameService {
    
    /**
     * 获取站名数据
     * @param url
     * @return
     */
    public String getStationName(String urlParam){ 
       String station_names=Communication.GetConnection (urlParam);
       String []station_names_array= station_names.split ("'");
       String stationNames=station_names_array[1];
       String[] stationName=stationNames.split ("@");
       for (int i = 1; i < stationName.length; i++) {
          System.out.println ( stationName[i]);
    }
       
      
       
       
       
       
//       String [] str=station_names.split ("@");
//       System.out.println ("length: "+str.length);
//       for (int i = 0; i < str.length; i++) {
//        System.out.println (str[i]);
//    }
       
       
       
      
       
       
       
        
        return "aa";
    }
    
    public static void main(String[] args) {
        StationNameService sns=new StationNameService(); 
        sns.getStationName (Contants.STATION_NAME_URL);
    }
}
