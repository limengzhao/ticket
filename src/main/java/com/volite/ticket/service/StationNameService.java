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
       File file=new File ("");
        if(file.exists ()){
            
            try {
                InputStream is=new FileInputStream (file);
                OutputStream os=new FileOutputStream (file);
                
            } catch (FileNotFoundException e) {
                System.out.println ("站名写入文件异常!");
            }
            
        }else{
            System.out.println ("站名文件不存在!");
        }
       
       
       
        
        return "aa";
    }
    
    public static void main(String[] args) {
        StationNameService sns=new StationNameService(); 
        sns.getStationName (Contants.STATION_NAME_URL);
    }
}
