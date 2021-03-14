package id.indosw.gitreposearch.api

import id.indosw.gitreposearch.api.models.GetRepos
import id.indosw.gitreposearch.api.models.Item
import id.indosw.gitreposearch.api.models.Owner
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface APIService {
    @GET(APIConstants.GET_REPOS)
    fun getRepos(@Query("q") q: String?, @Query("sort") sort: String?, @Query("order") order: String?, @Query("per_page") per_page: Int, @Query("page") page: Int): Call<GetRepos?>?

    @GET(APIConstants.GET_CONTRIBUTORS)
    fun getContributors(@Path("ownerName") ownerName: String?, @Path("repoName") repoName: String?): Call<List<Owner?>?>?

    @GET(APIConstants.GET_REPOS_BY_NAME)
    fun getReposByName(@Path("ownerName") ownerName: String?): Call<List<Item?>?>?
}