# SchedulesApi

All URIs are relative to *http://localhost:5001*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV0AlphaSchedulesGet**](SchedulesApi.md#apiV0AlphaSchedulesGet) | **GET** /api/v0-alpha/Schedules | GetSchedulesFilteredByDayOfWeek


<a id="apiV0AlphaSchedulesGet"></a>
# **apiV0AlphaSchedulesGet**
> kotlin.collections.List&lt;ScheduleSlim&gt; apiV0AlphaSchedulesGet(day, kids, sfw, unapproved, page, limit)

GetSchedulesFilteredByDayOfWeek

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import aruppi.client.model.*

val apiInstance = SchedulesApi()
val day : Days =  // Days | 
val kids : kotlin.Boolean = true // kotlin.Boolean | 
val sfw : kotlin.Boolean = true // kotlin.Boolean | 
val unapproved : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.collections.List<ScheduleSlim> = apiInstance.apiV0AlphaSchedulesGet(day, kids, sfw, unapproved, page, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchedulesApi#apiV0AlphaSchedulesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchedulesApi#apiV0AlphaSchedulesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **day** | [**Days**](.md)|  | [optional] [enum: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Unknown, Other]
 **kids** | **kotlin.Boolean**|  | [optional]
 **sfw** | **kotlin.Boolean**|  | [optional]
 **unapproved** | **kotlin.Boolean**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

[**kotlin.collections.List&lt;ScheduleSlim&gt;**](ScheduleSlim.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

