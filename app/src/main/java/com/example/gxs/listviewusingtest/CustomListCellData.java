package com.example.gxs.listviewusingtest;

/**
 * Created by GXS on 2017/3/25.
 */

public class CustomListCellData {
    public CustomListCellData(  String name, String description,String description1,String description2,String description3, int iconId) {
        this.name=name;
        this.description=description;
        this.description1=description1;
        this.description2=description2;
        this.description3=description3;
        this.iconId=iconId;
    }
    public String name="";
    public String description="";
    public String description1="";
    public String description2="";
    public String description3="";
    public int iconId=0;
}
