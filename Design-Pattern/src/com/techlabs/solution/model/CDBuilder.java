package com.techlabs.solution.model;

public class CDBuilder {  
    public CDType buildNokiaCD(){   
       CDType cds=new CDType();  
       cds.addItem(new Nokia());  
       return cds;  
}  
public CDType buildSamsungCD(){  
CDType cds=new CDType();  
cds.addItem(new Samsung());  
return cds;  
}  
}