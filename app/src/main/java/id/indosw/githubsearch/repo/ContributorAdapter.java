package id.indosw.githubsearch.repo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.indosw.githubsearch.R;
import id.indosw.gitreposearch.api.models.Owner;

@SuppressWarnings("rawtypes")
public class ContributorAdapter extends RecyclerView.Adapter {

    private List<Owner> contributorList;
    private OnItemClickListener onItemClickListener;
    private final Context ctx;

    public ContributorAdapter(Context ctx) {
        this.ctx = ctx;
        contributorList = new ArrayList<>();
    }

    void updateList(List<Owner> contributorList) {
        this.contributorList = contributorList;
        notifyDataSetChanged();
    }

    void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_contributor, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((MyViewHolder) holder).bindData(contributorList.get(position));
    }

    @Override
    public int getItemCount() {
        return contributorList.size();
    }

    @SuppressLint("NonConstantResourceId")
    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @BindView(R.id.imageViewProfile)
        ImageView imageViewProfile;

        @BindView(R.id.textViewName)
        TextView textViewName;

        MyViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);

            itemView.setOnClickListener(this);
        }

        void bindData(Owner owner) {
            textViewName.setText(owner.getLogin());

            Picasso.with(ctx).load(owner.getAvatarUrl())
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(imageViewProfile);
        }

        @Override
        public void onClick(View view) {
            onItemClickListener.onItemClick(contributorList.get(getAdapterPosition()));
        }
    }

    public interface OnItemClickListener {
        void onItemClick(Owner owner);
    }
}
