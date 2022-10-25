package io.github.dalcomdev.data.model

import com.google.gson.annotations.SerializedName
import io.github.dalcomdev.domain.model.GithubRepo

class GithubRepoResponse(
    @SerializedName("name")
    private val _name: String,

    @SerializedName("id")
    private val _id: String,

    @SerializedName("created_at")
    private val _date: String,

    @SerializedName("html_url")
    private val _url: String
) : GithubRepo {

    override val name: String
        get() = _name

    override val url: String
        get() = _url
}