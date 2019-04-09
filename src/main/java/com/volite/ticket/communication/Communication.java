package com.volite.ticket.communication;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class Communication {
    
    
    
    /**
     * 通过get方式获取站名称
     * @param params=URL+param
     */
    public static String GetConnection(String params){
        StringBuffer builder=new StringBuffer ();
        try {
            URL url=new URL (params);
            URLConnection conn=url.openConnection ();
            InputStream is=conn.getInputStream ();
            InputStreamReader dis=new InputStreamReader (is);
            BufferedReader br=new BufferedReader (dis);
            String line;
            while((line=br.readLine ())!=null){
                builder.append (line);
            }
            br.close ();
            dis.close ();
            is.close ();
            System.out.println ("station_names: "+builder.toString ());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString ();
    }
    
}
