package com.example.newsinshort.ui.repository

import com.example.newsinshort.data.datasource.NewsDataSource
import com.example.newsinshort.data.entity.NewsResponse
import com.example.utilities.ResourceState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsDataSource:NewsDataSource)
{
    suspend fun getNewsHeadline(country:String): Flow<ResourceState<NewsResponse>>
    {
        return flow {
            emit(ResourceState.Loading())
            val response = newsDataSource.getNewsHeadline(country)
            if(response.isSuccessful && response.body()!=null){
                emit(ResourceState.Success(response.body()!!))
            }else{
                ResourceState.Error<NewsResponse>("Error fetching news data")
            }
        }.catch {e->
            emit(ResourceState.Error(e?.localizedMessage?:"Some error in the flow"))
        }
    }
}