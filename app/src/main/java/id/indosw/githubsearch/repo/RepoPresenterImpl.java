package id.indosw.githubsearch.repo;

import android.content.Context;

import androidx.annotation.NonNull;

import java.util.List;
import java.util.Objects;

import id.indosw.githubsearch.GitHubApplication;
import id.indosw.githubsearch.R;
import id.indosw.gitreposearch.api.models.Owner;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RepoPresenterImpl implements RepoPresenter {

    private final Context context;
    private final RepoView repoView;

    RepoPresenterImpl(Context context) {
        this.context = context;
        this.repoView = (RepoView) context;
    }

    @Override
    public void getContributors(String ownerName, final String repoName) {

        Objects.requireNonNull(GitHubApplication.getInstance(context).getAPIService().getContributors(ownerName, repoName)).enqueue(new Callback<List<Owner>>() {
            @Override
            public void onResponse(@NonNull Call<List<Owner>> call, @NonNull Response<List<Owner>> response) {
                if (response.body() != null) {
                    repoView.attachContributors(response.body());
                } else {
                    repoView.changeMessage(context.getResources().getString(R.string.no_contributors));
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<Owner>> call, @NonNull Throwable t) {
                repoView.changeMessage(context.getResources().getString(R.string.no_contributors));
            }
        });

    }
}
