# ShowApi

All URIs are relative to *http://localhost:5001*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV0AlphaShowAltGetGet**](ShowApi.md#apiV0AlphaShowAltGetGet) | **GET** /api/v0-alpha/Show/AltGet | GetShowList
[**apiV0AlphaShowAsdasGet**](ShowApi.md#apiV0AlphaShowAsdasGet) | **GET** /api/v0-alpha/Show/asdas | GetShowList
[**apiV0AlphaShowGet**](ShowApi.md#apiV0AlphaShowGet) | **GET** /api/v0-alpha/Show | GetShowList
[**apiV0AlphaShowUpdatePost**](ShowApi.md#apiV0AlphaShowUpdatePost) | **POST** /api/v0-alpha/Show/update | UpdateAvailableShows


<a id="apiV0AlphaShowAltGetGet"></a>
# **apiV0AlphaShowAltGetGet**
> ShowTempPage apiV0AlphaShowAltGetGet(orderBy, includes, pageSize, pageIndex, idMax, idMin, onEmision, name, nameComparationType, runtimeMax, runtimeMin, premieredMax, premieredMin)

GetShowList

Sample Description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import aruppi.client.model.*

val apiInstance = ShowApi()
val orderBy : kotlin.collections.List<ShowTempColumnsOrderBy> =  // kotlin.collections.List<ShowTempColumnsOrderBy> | 
val includes : kotlin.collections.List<ShowTempIncludes> =  // kotlin.collections.List<ShowTempIncludes> | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val pageIndex : kotlin.Int = 56 // kotlin.Int | 
val idMax : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val idMin : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val onEmision : kotlin.Boolean = true // kotlin.Boolean | 
val name : kotlin.String = name_example // kotlin.String | 
val nameComparationType : StringComparationType =  // StringComparationType | 
val runtimeMax : kotlin.Int = 56 // kotlin.Int | 
val runtimeMin : kotlin.Int = 56 // kotlin.Int | 
val premieredMax : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val premieredMin : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
try {
    val result : ShowTempPage = apiInstance.apiV0AlphaShowAltGetGet(orderBy, includes, pageSize, pageIndex, idMax, idMin, onEmision, name, nameComparationType, runtimeMax, runtimeMin, premieredMax, premieredMin)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShowApi#apiV0AlphaShowAltGetGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShowApi#apiV0AlphaShowAltGetGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderBy** | [**kotlin.collections.List&lt;ShowTempColumnsOrderBy&gt;**](ShowTempColumnsOrderBy.md)|  | [optional]
 **includes** | [**kotlin.collections.List&lt;ShowTempIncludes&gt;**](ShowTempIncludes.md)|  | [optional]
 **pageSize** | **kotlin.Int**|  | [optional]
 **pageIndex** | **kotlin.Int**|  | [optional]
 **idMax** | **java.util.UUID**|  | [optional]
 **idMin** | **java.util.UUID**|  | [optional]
 **onEmision** | **kotlin.Boolean**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **nameComparationType** | [**StringComparationType**](.md)|  | [optional] [enum: Equals, StartsWith, Contains, EndsWith]
 **runtimeMax** | **kotlin.Int**|  | [optional]
 **runtimeMin** | **kotlin.Int**|  | [optional]
 **premieredMax** | **java.time.OffsetDateTime**|  | [optional]
 **premieredMin** | **java.time.OffsetDateTime**|  | [optional]

### Return type

[**ShowTempPage**](ShowTempPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/octet-stream

<a id="apiV0AlphaShowAsdasGet"></a>
# **apiV0AlphaShowAsdasGet**
> kotlin.collections.List&lt;Show&gt; apiV0AlphaShowAsdasGet(showName)

GetShowList

Sample Description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import aruppi.client.model.*

val apiInstance = ShowApi()
val showName : kotlin.String = showName_example // kotlin.String | 
try {
    val result : kotlin.collections.List<Show> = apiInstance.apiV0AlphaShowAsdasGet(showName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShowApi#apiV0AlphaShowAsdasGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShowApi#apiV0AlphaShowAsdasGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **showName** | **kotlin.String**|  | [optional]

### Return type

[**kotlin.collections.List&lt;Show&gt;**](Show.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/octet-stream

<a id="apiV0AlphaShowGet"></a>
# **apiV0AlphaShowGet**
> kotlin.collections.List&lt;Show&gt; apiV0AlphaShowGet(showName)

GetShowList

Sample Description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import aruppi.client.model.*

val apiInstance = ShowApi()
val showName : kotlin.String = showName_example // kotlin.String | 
try {
    val result : kotlin.collections.List<Show> = apiInstance.apiV0AlphaShowGet(showName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShowApi#apiV0AlphaShowGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShowApi#apiV0AlphaShowGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **showName** | **kotlin.String**|  | [optional]

### Return type

[**kotlin.collections.List&lt;Show&gt;**](Show.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/octet-stream

<a id="apiV0AlphaShowUpdatePost"></a>
# **apiV0AlphaShowUpdatePost**
> apiV0AlphaShowUpdatePost(startingIdInclusive, endingIdExclusive)

UpdateAvailableShows

Sample Description  Requiered Autorizations &#x3D;&gt;  Default Authorization

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import aruppi.client.model.*

val apiInstance = ShowApi()
val startingIdInclusive : kotlin.Int = 56 // kotlin.Int | 
val endingIdExclusive : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.apiV0AlphaShowUpdatePost(startingIdInclusive, endingIdExclusive)
} catch (e: ClientException) {
    println("4xx response calling ShowApi#apiV0AlphaShowUpdatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShowApi#apiV0AlphaShowUpdatePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startingIdInclusive** | **kotlin.Int**|  | [optional] [default to 1]
 **endingIdExclusive** | **kotlin.Int**|  | [optional] [default to 6]

### Return type

null (empty response body)

### Authorization


Configure SampleApiKey:
    ApiClient.apiKey["CustomAuth"] = ""
    ApiClient.apiKeyPrefix["CustomAuth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

