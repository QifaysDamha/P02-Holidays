package com.example.a16033760.p02_holidays;

public class Holiday {
    private String Name;
    private String Date;
    private String Image;

    public Holiday(String name, String date, String image) {
        this.Name = name;
        this.Date = date;
        this.Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
