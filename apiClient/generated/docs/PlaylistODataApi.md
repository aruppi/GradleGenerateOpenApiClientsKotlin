# PlaylistODataApi

All URIs are relative to *http://localhost:5001*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV0AlphaPlaylistODataGet**](PlaylistODataApi.md#apiV0AlphaPlaylistODataGet) | **GET** /api/v0-alpha/PlaylistOData | 


<a id="apiV0AlphaPlaylistODataGet"></a>
# **apiV0AlphaPlaylistODataGet**
> kotlin.collections.List&lt;Show&gt; apiV0AlphaPlaylistODataGet(select, expand, filter, orderby, top, skip, count)



Requiered Autorizations &#x3D;&gt;  Default Authorization

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import aruppi.client.model.*

val apiInstance = PlaylistODataApi()
val select : kotlin.String = select_example // kotlin.String | 
val expand : kotlin.String = expand_example // kotlin.String | 
val filter : kotlin.String = filter_example // kotlin.String | 
val orderby : kotlin.String = orderby_example // kotlin.String | 
val top : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val count : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.collections.List<Show> = apiInstance.apiV0AlphaPlaylistODataGet(select, expand, filter, orderby, top, skip, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlaylistODataApi#apiV0AlphaPlaylistODataGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlaylistODataApi#apiV0AlphaPlaylistODataGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **select** | **kotlin.String**|  | [optional]
 **expand** | **kotlin.String**|  | [optional]
 **filter** | **kotlin.String**|  | [optional]
 **orderby** | **kotlin.String**|  | [optional]
 **top** | **kotlin.Int**|  | [optional]
 **skip** | **kotlin.Int**|  | [optional]
 **count** | **kotlin.Boolean**|  | [optional]

### Return type

[**kotlin.collections.List&lt;Show&gt;**](Show.md)

### Authorization


Configure SampleApiKey:
    ApiClient.apiKey["CustomAuth"] = ""
    ApiClient.apiKeyPrefix["CustomAuth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/octet-stream

