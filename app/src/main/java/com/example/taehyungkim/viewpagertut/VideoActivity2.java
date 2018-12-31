package com.example.taehyungkim.viewpagertut;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
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
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),LinearLayoutManager.VERTICAL);
        dividerItemDecoration.setDrawable(ContextCompat.getDrawable(getBaseContext(),R.drawable.line_gray));
        recyclerView.addItemDecoration(dividerItemDecoration);

        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/X1qTgkrAsLM\" frameborder=\"0%\" allowfullscreen></iframe>","20th Century For Fanfare"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Qginc5hSzYw\" frameborder=\"0%\" allowfullscreen></iframe>","Somebody To Love"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/vPJpEFS0btc\" frameborder=\"0%\" allowfullscreen></iframe>","Doing All Right (...Revisited)"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/GNZORyl_2hE\" frameborder=\"0%\" allowfullscreen></iframe>","Keep Yourself Alive (Live at The Rainbow)"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/4mMhD_2lXyM\" frameborder=\"0%\" allowfullscreen></iframe>","Killer Queen (2011 Remaster)"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/YY1k1o4Y9UI\" frameborder=\"0%\" allowfullscreen></iframe>","Fat Bottomed Girls (Live in Paris)"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/fDsrbNCq7oc\" frameborder=\"0%\" allowfullscreen></iframe>","Bohemian Rhapsody (2011 Remaster)"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/YYAredeWxvc\" frameborder=\"0%\" allowfullscreen></iframe>","Now I'm Here (Live at The Hammersmith Odeon)"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/-iVwYSXL6SQ\" frameborder=\"0%\" allowfullscreen></iframe>","Crazy Little Thing Called Love (2011 Remaster)"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/vnrx4R5MfWA\" frameborder=\"0%\" allowfullscreen></iframe>","Love Of My Life (Live at Rock in Rio Festival)"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/sm8RTSNl5Zo\" frameborder=\"0%\" allowfullscreen></iframe>","We Will Rock You (Movie Mix)"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/8xzSV8T37Xo\" frameborder=\"0%\" allowfullscreen></iframe>","Another One Bites the Dust (2011 Remaster)"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/rWKlophZ_hQ\" frameborder=\"0%\" allowfullscreen></iframe>","I Want to Break Free"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/fTkH3CklVrI\" frameborder=\"0%\" allowfullscreen></iframe>","Under Pressure (feat. David Bowie)"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ibPy7A14gJQ\" frameborder=\"0%\" allowfullscreen></iframe>","Who Wants to Live Forever (2011 Remaster)"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ZWDXI7tpftA\" frameborder=\"0%\" allowfullscreen></iframe>","Bohemian Rhapsody (Live Aid)"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/n8MhGSbDrLg\" frameborder=\"0%\" allowfullscreen></iframe>","Radio Ga Ga (Live Aid)"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/YaSZlnDiQwE\" frameborder=\"0%\" allowfullscreen></iframe>","Ay-Oh (Live Aid)"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/03XIPkbDyLw\" frameborder=\"0%\" allowfullscreen></iframe>","Hammer to Fall (Live Aid)"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/BfDGoKxXZns\" frameborder=\"0%\" allowfullscreen></iframe>","We Are the Champions (Live Aid)"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/lA2CcnmorEM\" frameborder=\"0%\" allowfullscreen></iframe>","Don't Stop Me Now (…Revisited) "));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/IqZgtaZd9bc\" frameborder=\"0%\" allowfullscreen></iframe>","The Show Must Go On (2011 Remaster)"));


        VideoAdapter videoAdapter = new VideoAdapter(youTubeVideos);

        recyclerView.setAdapter(videoAdapter);



    }

}


