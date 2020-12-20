package com.example.giftcardsite.api.service

import retrofit2.http.POST

interface UserInfo {
    @POST("/api/metrics")
    fun postInfo()
}