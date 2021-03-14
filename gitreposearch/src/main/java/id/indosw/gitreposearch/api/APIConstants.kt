package id.indosw.gitreposearch.api

object APIConstants {
    const val HOST_URL = "https://api.github.com"
    const val GET_REPOS = "/search/repositories"
    const val GET_CONTRIBUTORS = "/repos/{ownerName}/{repoName}/contributors"
    const val GET_REPOS_BY_NAME = "/users/{ownerName}/repos"
}