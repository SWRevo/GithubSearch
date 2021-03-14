package id.indosw.gitreposearch.api.models

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

open class Owner protected constructor(`in`: Parcel) : Parcelable {
    @SerializedName("login")
    @Expose
    var login: String? = null

    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("node_id")
    @Expose
    var nodeId: String? = null

    @SerializedName("avatar_url")
    @Expose
    var avatarUrl: String? = null

    @SerializedName("gravatar_id")
    @Expose
    var gravatarId: String? = null

    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("html_url")
    @Expose
    var htmlUrl: String? = null

    @SerializedName("followers_url")
    @Expose
    var followersUrl: String? = null

    @SerializedName("following_url")
    @Expose
    var followingUrl: String? = null

    @SerializedName("gists_url")
    @Expose
    var gistsUrl: String? = null

    @SerializedName("starred_url")
    @Expose
    var starredUrl: String? = null

    @SerializedName("subscriptions_url")
    @Expose
    var subscriptionsUrl: String? = null

    @SerializedName("organizations_url")
    @Expose
    var organizationsUrl: String? = null

    @SerializedName("repos_url")
    @Expose
    var reposUrl: String? = null

    @SerializedName("events_url")
    @Expose
    var eventsUrl: String? = null

    @SerializedName("received_events_url")
    @Expose
    var receivedEventsUrl: String? = null

    @SerializedName("type")
    @Expose
    var type: String? = null

    @SerializedName("site_admin")
    @Expose
    var siteAdmin: Boolean? = null

    @SerializedName("contributions")
    @Expose
    var contributions = 0
    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(login)
        dest.writeValue(id)
        dest.writeString(nodeId)
        dest.writeString(avatarUrl)
        dest.writeString(gravatarId)
        dest.writeString(url)
        dest.writeString(htmlUrl)
        dest.writeString(followersUrl)
        dest.writeString(followingUrl)
        dest.writeString(gistsUrl)
        dest.writeString(starredUrl)
        dest.writeString(subscriptionsUrl)
        dest.writeString(organizationsUrl)
        dest.writeString(reposUrl)
        dest.writeString(eventsUrl)
        dest.writeString(receivedEventsUrl)
        dest.writeString(type)
        dest.writeValue(siteAdmin)
        dest.writeInt(contributions)
    }

    init {
        login = `in`.readString()
        id = `in`.readValue(Int::class.java.classLoader) as Int?
        nodeId = `in`.readString()
        avatarUrl = `in`.readString()
        gravatarId = `in`.readString()
        url = `in`.readString()
        htmlUrl = `in`.readString()
        followersUrl = `in`.readString()
        followingUrl = `in`.readString()
        gistsUrl = `in`.readString()
        starredUrl = `in`.readString()
        subscriptionsUrl = `in`.readString()
        organizationsUrl = `in`.readString()
        reposUrl = `in`.readString()
        eventsUrl = `in`.readString()
        receivedEventsUrl = `in`.readString()
        type = `in`.readString()
        siteAdmin = `in`.readValue(Boolean::class.java.classLoader) as Boolean?
        contributions = `in`.readInt()
    }

    companion object CREATOR : Parcelable.Creator<Owner> {
        override fun createFromParcel(parcel: Parcel): Owner {
            return Owner(parcel)
        }
        override fun newArray(size: Int): Array<Owner?> {
            return arrayOfNulls(size)
        }
    }
}