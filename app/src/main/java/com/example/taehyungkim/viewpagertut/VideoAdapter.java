package com.example.taehyungkim.viewpagertut;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.provider.Browser;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.VideoView;
import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

    List<YouTubeVideos> youTubeVideosList;



    public VideoAdapter() {

    }

    public VideoAdapter(List<YouTubeVideos> youTubeVideosList) {
        this.youTubeVideosList = youTubeVideosList;
    }

    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_view, parent, false);

        return new VideoViewHolder(view);

    }

    @Override
    public void onBindViewHolder(VideoViewHolder holder, int position) {
        holder.videoWeb.loadData(youTubeVideosList.get(position).getVideoUrl(), "text/html", "utf-8");
        holder.titleWeb.setText(youTubeVideosList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return youTubeVideosList.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder {


        WebView videoWeb;
        TextView titleWeb;


        public VideoViewHolder(View itemView) {
            super(itemView);

            videoWeb = (WebView) itemView.findViewById(R.id.videoWebView);
            titleWeb = (TextView) itemView.findViewById(R.id.titleWebView);

            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient());
        }
    }
}
