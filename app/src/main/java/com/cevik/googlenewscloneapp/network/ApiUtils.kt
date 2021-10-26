package com.cevik.googlenewscloneapp.network


class ApiUtils {

    companion object{
        private const val BASE_URL="https://newsapi.org/v2/"

        fun newsDAOInterfaceget():NewsDAOInterface{
            return RetrofitClient.getClient(BASE_URL).create(NewsDAOInterface::class.java)
        }

    }

}