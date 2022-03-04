package com.tungsten.hmclpe.control.bean.button;

public class ButtonStyle {

    public String name;
    public int textSize;
    public String textColor;
    public int cornerRadius;
    public float strokeWidth;
    public String strokeColor;
    public String fillColor;
    public int textSizePress;
    public String textColorPress;
    public int cornerRadiusPress;
    public float strokeWidthPress;
    public String strokeColorPress;
    public String fillColorPress;

    public ButtonStyle () {
        this ("",13,"#ffffff",8,0.5f,"#1a000000","#00ffffff",13,"#ffffff",8,0.5f,"#1a000000","#40ffffff");
    }

    public ButtonStyle (String name,int textSize,String textColor,int cornerRadius,float strokeWidth,String strokeColor,String fillColor,int textSizePress,String textColorPress,int cornerRadiusPress,float strokeWidthPress,String strokeColorPress,String fillColorPress) {
        this.name = name;
        this.textSize = textSize;
        this.textColor = textColor;
        this.cornerRadius = cornerRadius;
        this.strokeWidth = strokeWidth;
        this.strokeColor = strokeColor;
        this.fillColor = fillColor;
        this.textSizePress = textSizePress;
        this.textColorPress = textColorPress;
        this.cornerRadiusPress = cornerRadiusPress;
        this.strokeWidthPress = strokeWidthPress;
        this.strokeColorPress = strokeColorPress;
        this.fillColorPress = fillColorPress;
    }

}
