package com.example.newsinshort.data.entity

data class NewsResponse(
    val status:String,
    val totalResults:Int,
    val articles:List<Articles>
)
data class Articles(
    val author:String,
    val tittle:String,
    val description:String,
    val url:String,
    val urlToImage:String,
    val publishedAt:String,
    val content:String,
    val source:Source
)
data class Source(
    val id:String,
    val name:String
)