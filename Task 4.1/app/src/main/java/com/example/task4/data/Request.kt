package com.example.task4.data

import com.google.gson.annotations.SerializedName

data class Request(

    @field:SerializedName("unit")
    val unit: String? = null,

    @field:SerializedName("query")
    val query: String? = null,

    @field:SerializedName("language")
    val language: String? = null,

    @field:SerializedName("type")
    val type: String? = null
)