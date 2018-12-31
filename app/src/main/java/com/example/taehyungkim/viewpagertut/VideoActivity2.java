package com.example.taehyungkim.viewpagertut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

public class VideoActivity2 extends AppCompatActivity {


    RecyclerView recyclerView;
    Vector<YouTubeVideos> youTubeVideos = new Vector<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_fragment);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/X1qTgkrAsLM\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Qginc5hSzYw\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/vPJpEFS0btc\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/GNZORyl_2hE\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/4mMhD_2lXyM\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/YY1k1o4Y9UI\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/fDsrbNCq7oc\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/YYAredeWxvc\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/-iVwYSXL6SQ\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/vnrx4R5MfWA\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/sm8RTSNl5Zo\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/8xzSV8T37Xo\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/rWKlophZ_hQ\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/fTkH3CklVrI\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ibPy7A14gJQ\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ZWDXI7tpftA\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/n8MhGSbDrLg\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/YaSZlnDiQwE\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/03XIPkbDyLw\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/BfDGoKxXZns\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/lA2CcnmorEM\" frameborder=\"0%\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/IqZgtaZd9bc\" frameborder=\"0%\" allowfullscreen></iframe>"));


        VideoAdapter videoAdapter = new VideoAdapter(youTubeVideos);

        recyclerView.setAdapter(videoAdapter);



    }

}


