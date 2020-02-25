package com.example.moean_p;

import com.google.firebase.database.Exclude;
import java.io.*;

public class VideoAdapter2 {

    private String name;
    private String videoUrl;
    private String mKey;

    public VideoAdapter2(){

    }

    public VideoAdapter2(String name, String videoUrl) {
        if(name.trim().equals("")){
            name="بدون عنوان";
        }
        this.name = name;
        this.videoUrl = videoUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideoUrl() {
        return videoUrl;
    }



    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
    @Exclude
    public String getmKey(){
        return mKey;
    }
    @Exclude

    public void setmKey(String key){
        mKey=key;
    }
}
