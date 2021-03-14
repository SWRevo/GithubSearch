package id.indosw.githubsearch.profile;

import android.content.Context;

import androidx.annotation.NonNull;

import java.util.List;
import java.util.Objects;

import id.indosw.githubsearch.GitHubApplication;
import id.indosw.gitreposearch.api.models.Item;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProfilePresenterImpl implements ProfilePresenter {

    private final ProfileView profileView;
    private final Context context;

    ProfilePresenterImpl(Context context) {
        this.context = context;
        this.profileView = (ProfileView) context;
    }

    @Override
    public void getRepos(String name) {

        Objects.requireNonNull(GitHubApplication.getInstance(context).getAPIService().getReposByName(name)).enqueue(new Callback<List<Item>>() {
            @Override
            public void onResponse(@NonNull Call<List<Item>> call, @NonNull Response<List<Item>> response) {
                if (response.body() != null) {
                    profileView.attachRepos(response.body());
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<Item>> call, @NonNull Throwable t) {

            }
        });

    }
}
