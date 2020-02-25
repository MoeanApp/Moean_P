package com.example.moean_p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VideoAdapter3 extends RecyclerView.Adapter<VideoAdapter3.ViewHolder3> {

    private List<VideoAdapter2> mUploads ;

    private Context mContext;
    private VideoAdapter.onItemClickListener mListener;

    public VideoAdapter3(Context context,List<VideoAdapter2> uploads) {
        mUploads = uploads;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.video_item_caregiver, parent, false);
        return new VideoAdapter3.ViewHolder3(view);    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder3 holder, int position) {
        VideoAdapter2 uploadCurrent=mUploads.get(position);
        holder.VideoName.setText(uploadCurrent.getName());
    }

    @Override
    public int getItemCount() {
        return mUploads.size();
    }

    public class ViewHolder3 extends RecyclerView.ViewHolder{
        public TextView VideoName;
        public VideoView videoView;
        public  TextView advisorName;

        public ViewHolder3(@NonNull View itemView) {
            super(itemView);
            VideoName=itemView.findViewById(R.id.video_name);
            //videoView=itemView.findViewById(R.id.advisor_name);
            //advisorName=itemView.findViewById(R.id.advisor_name);

        }
    }
}
