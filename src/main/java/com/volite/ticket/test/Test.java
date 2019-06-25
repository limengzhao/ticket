package com.volite.ticket.test;

public class Test {
    
    public static void main(String[] args) {
        String str="gzn|公主岭南|GBT|gongzhulingnan|gzln|179";
        String[] strs=str.split ("\\|");
        System.out.println (strs[2]);
    }
    
}
