package com.example.moean_p;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.Window;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.core.Path;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Video_Play extends AppCompatActivity  {
    public static VideoView videoView;
    public static  ArrayList<String> ListOfURI=new ArrayList<>();


    public static int pos=Videos.position1;

    int index=0;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video__play);

        for(int i=0;i< Videos.ListOfURIVideos.size();i++){
            ListOfURI.add(Videos.ListOfURIVideos.get(i));
        }



        videoView = findViewById(R.id.video_view);

       final MediaController mediaController=new MediaController(this);
       mediaController.setAnchorView(videoView);

       videoView.setMediaController(mediaController);
       //Uri uri=Uri.fromFile(Videos.mUploads.get(Videos.position1).);
       //videoView.setVideoURI(Uri.parse(Videos.ListOfUri.get(Videos.position1).toString()));

        videoView.setVideoURI(Uri.parse(ListOfURI.get(pos)));

       videoView.requestFocus();
       videoView.start();
    }




}
