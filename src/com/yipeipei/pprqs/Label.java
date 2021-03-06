package com.yipeipei.pprqs;

import java.util.ArrayList;

public class Label {
    ArrayList<Node> lout = new ArrayList<Node>();
    ArrayList<Node> lin = new ArrayList<Node>();
    
    public int size(){
        return lout.size() + lin.size();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String NEWLINE = System.getProperty("line.separator");
        
        sb.append("Label size: " + size());
        sb.append(NEWLINE);
        sb.append("Lout: ");
        sb.append(lout);
        sb.append(NEWLINE);
        sb.append("Lin: ");
        sb.append(lin);
        
        sb.append(NEWLINE);
        
        return sb.toString();
    }
}
