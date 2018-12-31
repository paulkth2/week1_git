package com.example.taehyungkim.viewpagertut;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

public class VideoActivity4 extends AppCompatActivity {


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


        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/sUJkCXE4sAA\" frameborder=\"0%\" allowfullscreen></iframe>","Love Of My Life"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/fJ9rUzIMcZQ\" frameborder=\"0%\" allowfullscreen></iframe>","Bohemian Rhapsody"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/JU5LMG3WFBw\" frameborder=\"0%\" allowfullscreen></iframe>","Hammer To Fall"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/2ZBtPf7FOoM\" frameborder=\"0%\" allowfullscreen></iframe>","Killer Quee"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/04854XqcfCY\" frameborder=\"0%\" allowfullscreen></iframe>","We Are The Champions"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/_Jtpf8N5IDE\" frameborder=\"0%\" allowfullscreen></iframe>","Who Wants To Live Forever"));


        VideoAdapter videoAdapter = new VideoAdapter(youTubeVideos);

        recyclerView.setAdapter(videoAdapter);



    }

}


