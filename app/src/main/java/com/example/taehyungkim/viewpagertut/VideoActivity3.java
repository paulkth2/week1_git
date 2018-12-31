package com.example.taehyungkim.viewpagertut;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

public class VideoActivity3 extends AppCompatActivity {


    RecyclerView recyclerView;
    Vector<YouTubeVideos> youTubeVideos = new Vector<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_fragment);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),LinearLayoutManager.VERTICAL);
        dividerItemDecoration.setDrawable(ContextCompat.getDrawable(getBaseContext(),R.drawable.line_gray));
        recyclerView.addItemDecoration(dividerItemDecoration);

        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/HgzGwKwLmgM\" frameborder=\"0%\" allowfullscreen></iframe>","Don't Stop Me Now"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/-tJYN-eG1zk\" frameborder=\"0%\" allowfullscreen></iframe>","We Will Rock You"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/azdwsXLmrHE\" frameborder=\"0%\" allowfullscreen></iframe>","Radio Ga Ga"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/a01QQZyl-_I\" frameborder=\"0%\" allowfullscreen></iframe>","Under Pressure"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/JofwEB9g1zg\" frameborder=\"0%\" allowfullscreen></iframe>","Keep Yourself Alive"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zO6D_BAuYCI\" frameborder=\"0%\" allowfullscreen></iframe>","Crazy Little Thing Called Love"));


        VideoAdapter videoAdapter = new VideoAdapter(youTubeVideos);

        recyclerView.setAdapter(videoAdapter);



    }

}


