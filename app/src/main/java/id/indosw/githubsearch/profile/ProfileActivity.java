package id.indosw.githubsearch.profile;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.indosw.githubsearch.R;
import id.indosw.githubsearch.home.RepoAdapter;
import id.indosw.githubsearch.repo.RepoActivity;
import id.indosw.gitreposearch.api.models.Item;
import id.indosw.gitreposearch.api.models.Owner;
import id.indosw.gitreposearch.utils.Constants;

@SuppressLint("NonConstantResourceId")
public class ProfileActivity extends AppCompatActivity implements ProfileView, RepoAdapter.OnItemClickListener {

    @BindView(R.id.imageViewProfile)
    ImageView imageViewProfile;

    @BindView(R.id.textViewName)
    TextView textViewName;

    @BindView(R.id.textViewFetching)
    TextView textViewFetching;

    @BindView(R.id.recyclerViewRepos)
    RecyclerView recyclerViewRepos;

    private Owner profile;

    private ProfilePresenterImpl profilePresenterImpl;

    private RepoAdapter repoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        ButterKnife.bind(this);
        initRecyclerView();
        profilePresenterImpl = new ProfilePresenterImpl(this);
        getIntentData();
    }

    private void initRecyclerView() {
        recyclerViewRepos.setItemAnimator(new DefaultItemAnimator());
        recyclerViewRepos.setLayoutManager(new LinearLayoutManager(this));
        ViewCompat.setNestedScrollingEnabled(recyclerViewRepos, false);

        repoAdapter = new RepoAdapter(false, recyclerViewRepos, getApplicationContext());
        repoAdapter.setOnItemClickListener(this);
        recyclerViewRepos.setAdapter(repoAdapter);
    }

    private void getIntentData() {
        Intent intent = getIntent();
        profile = intent.getParcelableExtra(Constants.KEY_PROFILE);

        textViewName.setText(profile.getLogin());

        Picasso.with(getApplicationContext()).load(profile.getAvatarUrl())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(imageViewProfile);

        getRepos();
    }

    private void getRepos() {
        profilePresenterImpl.getRepos(profile.getLogin());
    }

    @Override
    public void attachRepos(List<Item> repoList) {
        repoAdapter.updateList(repoList);

        textViewFetching.setVisibility(View.GONE);
        recyclerViewRepos.setVisibility(View.VISIBLE);
    }

    @Override
    public void onItemClick(Item item) {
        launchRepoActivity(item);
    }

    private void launchRepoActivity(Item item) {
        Intent intent = new Intent(this, RepoActivity.class);
        intent.putExtra(Constants.KEY_REPO, item);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Respond to the action bar's Up/Home button
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
