package id.indosw.gitreposearch.api.models

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

open class Item//this.mirrorUrl = in.readParcelable(Object.class.getClassLoader());
//this.license = in.readParcelable(Object.class.getClassLoader());
protected constructor(`in`: Parcel) : Parcelable {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("node_id")
    @Expose
    var nodeId: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("full_name")
    @Expose
    var fullName: String? = null

    @SerializedName("owner")
    @Expose
    var owner: Owner? = null

    @SerializedName("private")
    @Expose
    var private: Boolean? = null

    @SerializedName("html_url")
    @Expose
    var htmlUrl: String? = null

    @SerializedName("description")
    @Expose
    var description: String? = null

    @SerializedName("fork")
    @Expose
    var fork: Boolean? = null

    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("forks_url")
    @Expose
    var forksUrl: String? = null

    @SerializedName("keys_url")
    @Expose
    var keysUrl: String? = null

    @SerializedName("collaborators_url")
    @Expose
    var collaboratorsUrl: String? = null

    @SerializedName("teams_url")
    @Expose
    var teamsUrl: String? = null

    @SerializedName("hooks_url")
    @Expose
    var hooksUrl: String? = null

    @SerializedName("issue_events_url")
    @Expose
    var issueEventsUrl: String? = null

    @SerializedName("events_url")
    @Expose
    var eventsUrl: String? = null

    @SerializedName("assignees_url")
    @Expose
    var assigneesUrl: String? = null

    @SerializedName("branches_url")
    @Expose
    var branchesUrl: String? = null

    @SerializedName("tags_url")
    @Expose
    var tagsUrl: String? = null

    @SerializedName("blobs_url")
    @Expose
    var blobsUrl: String? = null

    @SerializedName("git_tags_url")
    @Expose
    var gitTagsUrl: String? = null

    @SerializedName("git_refs_url")
    @Expose
    var gitRefsUrl: String? = null

    @SerializedName("trees_url")
    @Expose
    var treesUrl: String? = null

    @SerializedName("statuses_url")
    @Expose
    var statusesUrl: String? = null

    @SerializedName("languages_url")
    @Expose
    var languagesUrl: String? = null

    @SerializedName("stargazers_url")
    @Expose
    var stargazersUrl: String? = null

    @SerializedName("contributors_url")
    @Expose
    var contributorsUrl: String? = null

    @SerializedName("subscribers_url")
    @Expose
    var subscribersUrl: String? = null

    @SerializedName("subscription_url")
    @Expose
    var subscriptionUrl: String? = null

    @SerializedName("commits_url")
    @Expose
    var commitsUrl: String? = null

    @SerializedName("git_commits_url")
    @Expose
    var gitCommitsUrl: String? = null

    @SerializedName("comments_url")
    @Expose
    var commentsUrl: String? = null

    @SerializedName("issue_comment_url")
    @Expose
    var issueCommentUrl: String? = null

    @SerializedName("contents_url")
    @Expose
    var contentsUrl: String? = null

    @SerializedName("compare_url")
    @Expose
    var compareUrl: String? = null

    @SerializedName("merges_url")
    @Expose
    var mergesUrl: String? = null

    @SerializedName("archive_url")
    @Expose
    var archiveUrl: String? = null

    @SerializedName("downloads_url")
    @Expose
    var downloadsUrl: String? = null

    @SerializedName("issues_url")
    @Expose
    var issuesUrl: String? = null

    @SerializedName("pulls_url")
    @Expose
    var pullsUrl: String? = null

    @SerializedName("milestones_url")
    @Expose
    var milestonesUrl: String? = null

    @SerializedName("notifications_url")
    @Expose
    var notificationsUrl: String? = null

    @SerializedName("labels_url")
    @Expose
    var labelsUrl: String? = null

    @SerializedName("releases_url")
    @Expose
    var releasesUrl: String? = null

    @SerializedName("deployments_url")
    @Expose
    var deploymentsUrl: String? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null

    @SerializedName("pushed_at")
    @Expose
    var pushedAt: String? = null

    @SerializedName("git_url")
    @Expose
    var gitUrl: String? = null

    @SerializedName("ssh_url")
    @Expose
    var sshUrl: String? = null

    @SerializedName("clone_url")
    @Expose
    var cloneUrl: String? = null

    @SerializedName("svn_url")
    @Expose
    var svnUrl: String? = null

    @SerializedName("homepage")
    @Expose
    var homepage: String? = null

    @SerializedName("size")
    @Expose
    var size: Int? = null

    @SerializedName("stargazers_count")
    @Expose
    var stargazersCount: Int? = null

    @SerializedName("watchers_count")
    @Expose
    var watchersCount: Int? = null

    @SerializedName("language")
    @Expose
    var language: String? = null

    @SerializedName("has_issues")
    @Expose
    var hasIssues: Boolean? = null

    @SerializedName("has_projects")
    @Expose
    var hasProjects: Boolean? = null

    @SerializedName("has_downloads")
    @Expose
    var hasDownloads: Boolean? = null

    @SerializedName("has_wiki")
    @Expose
    var hasWiki: Boolean? = null

    @SerializedName("has_pages")
    @Expose
    var hasPages: Boolean? = null

    @SerializedName("forks_count")
    @Expose
    var forksCount: Int? = null

    @SerializedName("mirror_url")
    @Expose
    var mirrorUrl: Any? = null

    @SerializedName("archived")
    @Expose
    var archived: Boolean? = null

    @SerializedName("open_issues_count")
    @Expose
    var openIssuesCount: Int? = null

    @SerializedName("license")
    @Expose
    var license: Any? = null

    @SerializedName("forks")
    @Expose
    var forks: Int? = null

    @SerializedName("open_issues")
    @Expose
    var openIssues: Int? = null

    @SerializedName("watchers")
    @Expose
    var watchers: Int? = null

    @SerializedName("default_branch")
    @Expose
    var defaultBranch: String? = null

    @SerializedName("network_count")
    @Expose
    var networkCount: Int? = null

    @SerializedName("subscribers_count")
    @Expose
    var subscribersCount: Int? = null
    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(id)
        dest.writeString(nodeId)
        dest.writeString(name)
        dest.writeString(fullName)
        dest.writeParcelable(owner, flags)
        dest.writeValue(private)
        dest.writeString(htmlUrl)
        dest.writeString(description)
        dest.writeValue(fork)
        dest.writeString(url)
        dest.writeString(forksUrl)
        dest.writeString(keysUrl)
        dest.writeString(collaboratorsUrl)
        dest.writeString(teamsUrl)
        dest.writeString(hooksUrl)
        dest.writeString(issueEventsUrl)
        dest.writeString(eventsUrl)
        dest.writeString(assigneesUrl)
        dest.writeString(branchesUrl)
        dest.writeString(tagsUrl)
        dest.writeString(blobsUrl)
        dest.writeString(gitTagsUrl)
        dest.writeString(gitRefsUrl)
        dest.writeString(treesUrl)
        dest.writeString(statusesUrl)
        dest.writeString(languagesUrl)
        dest.writeString(stargazersUrl)
        dest.writeString(contributorsUrl)
        dest.writeString(subscribersUrl)
        dest.writeString(subscriptionUrl)
        dest.writeString(commitsUrl)
        dest.writeString(gitCommitsUrl)
        dest.writeString(commentsUrl)
        dest.writeString(issueCommentUrl)
        dest.writeString(contentsUrl)
        dest.writeString(compareUrl)
        dest.writeString(mergesUrl)
        dest.writeString(archiveUrl)
        dest.writeString(downloadsUrl)
        dest.writeString(issuesUrl)
        dest.writeString(pullsUrl)
        dest.writeString(milestonesUrl)
        dest.writeString(notificationsUrl)
        dest.writeString(labelsUrl)
        dest.writeString(releasesUrl)
        dest.writeString(deploymentsUrl)
        dest.writeString(createdAt)
        dest.writeString(updatedAt)
        dest.writeString(pushedAt)
        dest.writeString(gitUrl)
        dest.writeString(sshUrl)
        dest.writeString(cloneUrl)
        dest.writeString(svnUrl)
        dest.writeString(homepage)
        dest.writeValue(size)
        dest.writeValue(stargazersCount)
        dest.writeValue(watchersCount)
        dest.writeString(language)
        dest.writeValue(hasIssues)
        dest.writeValue(hasProjects)
        dest.writeValue(hasDownloads)
        dest.writeValue(hasWiki)
        dest.writeValue(hasPages)
        dest.writeValue(forksCount)
        //        dest.writeParcelable((Parcelable) this.mirrorUrl, flags);
        dest.writeValue(archived)
        dest.writeValue(openIssuesCount)
        //        dest.writeParcelable((Parcelable) this.license, flags);
        dest.writeValue(forks)
        dest.writeValue(openIssues)
        dest.writeValue(watchers)
        dest.writeString(defaultBranch)
        dest.writeValue(networkCount)
        dest.writeValue(subscribersCount)
    }

    init {
        id = `in`.readValue(Int::class.java.classLoader) as Int?
        nodeId = `in`.readString()
        name = `in`.readString()
        fullName = `in`.readString()
        owner = `in`.readParcelable(Owner::class.java.classLoader)
        private = `in`.readValue(Boolean::class.java.classLoader) as Boolean?
        htmlUrl = `in`.readString()
        description = `in`.readString()
        fork = `in`.readValue(Boolean::class.java.classLoader) as Boolean?
        url = `in`.readString()
        forksUrl = `in`.readString()
        keysUrl = `in`.readString()
        collaboratorsUrl = `in`.readString()
        teamsUrl = `in`.readString()
        hooksUrl = `in`.readString()
        issueEventsUrl = `in`.readString()
        eventsUrl = `in`.readString()
        assigneesUrl = `in`.readString()
        branchesUrl = `in`.readString()
        tagsUrl = `in`.readString()
        blobsUrl = `in`.readString()
        gitTagsUrl = `in`.readString()
        gitRefsUrl = `in`.readString()
        treesUrl = `in`.readString()
        statusesUrl = `in`.readString()
        languagesUrl = `in`.readString()
        stargazersUrl = `in`.readString()
        contributorsUrl = `in`.readString()
        subscribersUrl = `in`.readString()
        subscriptionUrl = `in`.readString()
        commitsUrl = `in`.readString()
        gitCommitsUrl = `in`.readString()
        commentsUrl = `in`.readString()
        issueCommentUrl = `in`.readString()
        contentsUrl = `in`.readString()
        compareUrl = `in`.readString()
        mergesUrl = `in`.readString()
        archiveUrl = `in`.readString()
        downloadsUrl = `in`.readString()
        issuesUrl = `in`.readString()
        pullsUrl = `in`.readString()
        milestonesUrl = `in`.readString()
        notificationsUrl = `in`.readString()
        labelsUrl = `in`.readString()
        releasesUrl = `in`.readString()
        deploymentsUrl = `in`.readString()
        createdAt = `in`.readString()
        updatedAt = `in`.readString()
        pushedAt = `in`.readString()
        gitUrl = `in`.readString()
        sshUrl = `in`.readString()
        cloneUrl = `in`.readString()
        svnUrl = `in`.readString()
        homepage = `in`.readString()
        size = `in`.readValue(Int::class.java.classLoader) as Int?
        stargazersCount = `in`.readValue(Int::class.java.classLoader) as Int?
        watchersCount = `in`.readValue(Int::class.java.classLoader) as Int?
        language = `in`.readString()
        hasIssues = `in`.readValue(Boolean::class.java.classLoader) as Boolean?
        hasProjects = `in`.readValue(Boolean::class.java.classLoader) as Boolean?
        hasDownloads = `in`.readValue(Boolean::class.java.classLoader) as Boolean?
        hasWiki = `in`.readValue(Boolean::class.java.classLoader) as Boolean?
        hasPages = `in`.readValue(Boolean::class.java.classLoader) as Boolean?
        forksCount = `in`.readValue(Int::class.java.classLoader) as Int?
        archived = `in`.readValue(Boolean::class.java.classLoader) as Boolean?
        openIssuesCount = `in`.readValue(Int::class.java.classLoader) as Int?
        forks = `in`.readValue(Int::class.java.classLoader) as Int?
        openIssues = `in`.readValue(Int::class.java.classLoader) as Int?
        watchers = `in`.readValue(Int::class.java.classLoader) as Int?
        defaultBranch = `in`.readString()
        networkCount = `in`.readValue(Int::class.java.classLoader) as Int?
        subscribersCount = `in`.readValue(Int::class.java.classLoader) as Int?
    }

    companion object CREATOR : Parcelable.Creator<Item> {
        override fun createFromParcel(parcel: Parcel): Item {
            return Item(parcel)
        }
        override fun newArray(size: Int): Array<Item?> {
            return arrayOfNulls(size)
        }
    }
}