package id.indosw.githubsearch.repo;

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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import id.indosw.githubsearch.R;
import id.indosw.githubsearch.profile.ProfileActivity;
import id.indosw.githubsearch.webview.WebViewActivity;
import id.indosw.gitreposearch.api.models.Item;
import id.indosw.gitreposearch.api.models.Owner;
import id.indosw.gitreposearch.utils.Constants;

@SuppressLint("NonConstantResourceId")
public class RepoActivity extends AppCompatActivity implements RepoView, ContributorAdapter.OnItemClickListener {

    @BindView(R.id.textViewName)
    TextView textViewName;

    @BindView(R.id.textViewLink)
    TextView textViewLink;

    @BindView(R.id.textViewDesc)
    TextView textViewDesc;

    @BindView(R.id.textViewFetching)
    TextView textViewFetching;

    @BindView(R.id.imageViewProfile)
    ImageView imageViewProfile;

    @BindView(R.id.recyclerViewContributors)
    RecyclerView recyclerViewContributors;

    private String repoName;
    private String ownerName;
    private String repoLink;

    private RepoPresenterImpl repoPresenterImpl;

    private ContributorAdapter contributorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repo);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        ButterKnife.bind(this);
        initRecyclerView();
        repoPresenterImpl = new RepoPresenterImpl(this);
        getIntentData();
    }

    private void getIntentData() {
        Intent intent = getIntent();

        Item repo = intent.getParcelableExtra(Constants.KEY_REPO);

        if (repo != null) {
            repoName = repo.getName();
            repoLink = repo.getHtmlUrl();
            ownerName = Objects.requireNonNull(repo.getOwner()).getLogin();

            textViewName.setText(repoName);
            textViewLink.setText(repo.getHtmlUrl());
            textViewDesc.setText(repo.getDescription() == null ||
                    (repo.getDescription() != null && repo.getDescription().length() == 0) ? "No Description" : repo.getDescription());

            Picasso.with(getApplicationContext()).load(repo.getOwner().getAvatarUrl())
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(imageViewProfile);

            getContributors();
        }
    }

    @OnClick(R.id.textViewLinkClick)
    public void onLinkClick() {
        openWebView(repoLink, repoName);
    }

    private void openWebView(String repoLink, String repoName) {
        Intent intent = new Intent(this, WebViewActivity.class);
        intent.putExtra(Constants.WEBVIEW_URL, repoLink);
        intent.putExtra(Constants.KEY_REPO, repoName);
        startActivity(intent);
    }

    private void initRecyclerView() {
        recyclerViewContributors.setItemAnimator(new DefaultItemAnimator());
        recyclerViewContributors.setLayoutManager(new GridLayoutManager(this, 4));
        ViewCompat.setNestedScrollingEnabled(recyclerViewContributors, false);

        contributorAdapter = new ContributorAdapter(getApplicationContext());
        contributorAdapter.setOnItemClickListener(this);
        recyclerViewContributors.setAdapter(contributorAdapter);
    }

    private void getContributors() {
        repoPresenterImpl.getContributors(ownerName, repoName);
    }

    @Override
    public void attachContributors(List<Owner> contributorList) {
        contributorAdapter.updateList(contributorList);
        hideMessage();
    }

    public void hideMessage() {
        textViewFetching.setVisibility(View.GONE);
        recyclerViewContributors.setVisibility(View.VISIBLE);
    }

    @Override
    public void changeMessage(String message) {
        textViewFetching.setText(message);
        showMessage();
    }

    public void showMessage() {
        recyclerViewContributors.setVisibility(View.GONE);
        textViewFetching.setVisibility(View.VISIBLE);
    }

    @Override
    public void onItemClick(Owner owner) {
        launchProfileActivity(owner);
    }

    private void launchProfileActivity(Owner owner) {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra(Constants.KEY_PROFILE, owner);
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
