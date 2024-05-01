package wrapper

import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request

class HttpWrapper {
    private val okHttpClient = OkHttpClient()

    fun getResponseBody(url: String, pathSegments: String? = ""): String {
        return try {
            val requestUrl = url.toHttpUrl().newBuilder().build()

            val request = Request.Builder().url("$requestUrl" + pathSegments).method("GET", null).addHeader("ContentType", "application/json").build()

            val response = okHttpClient.newCall(request).execute()

            val responseBody = response.body!!.string()

            response.close()
            return responseBody
        } catch (ex: Exception) {
            println("GET ResponseBody failed due to ${ex.printStackTrace()}").toString()
        }
    }
}