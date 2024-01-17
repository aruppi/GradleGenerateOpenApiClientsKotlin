# SampleApi

All URIs are relative to *http://localhost:5001*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV0AlphaSampleSampleEndpointWithCustomPoliciesAndRolesGet**](SampleApi.md#apiV0AlphaSampleSampleEndpointWithCustomPoliciesAndRolesGet) | **GET** /api/v0-alpha/Sample/SampleEndpointWithCustomPoliciesAndRoles | UpdateAvailableShows
[**apiV0AlphaSampleSampleEndpointWithNoConfigurationGet**](SampleApi.md#apiV0AlphaSampleSampleEndpointWithNoConfigurationGet) | **GET** /api/v0-alpha/Sample/SampleEndpointWithNoConfiguration | UpdateAvailableShows


<a id="apiV0AlphaSampleSampleEndpointWithCustomPoliciesAndRolesGet"></a>
# **apiV0AlphaSampleSampleEndpointWithCustomPoliciesAndRolesGet**
> apiV0AlphaSampleSampleEndpointWithCustomPoliciesAndRolesGet()

UpdateAvailableShows

Sample Description  Requiered Autorizations &#x3D;&gt;  Policies: SamplePolicy, Other  Roles: SampleRole, Others  

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import aruppi.client.model.*

val apiInstance = SampleApi()
try {
    apiInstance.apiV0AlphaSampleSampleEndpointWithCustomPoliciesAndRolesGet()
} catch (e: ClientException) {
    println("4xx response calling SampleApi#apiV0AlphaSampleSampleEndpointWithCustomPoliciesAndRolesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SampleApi#apiV0AlphaSampleSampleEndpointWithCustomPoliciesAndRolesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure SampleApiKey:
    ApiClient.apiKey["CustomAuth"] = ""
    ApiClient.apiKeyPrefix["CustomAuth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="apiV0AlphaSampleSampleEndpointWithNoConfigurationGet"></a>
# **apiV0AlphaSampleSampleEndpointWithNoConfigurationGet**
> apiV0AlphaSampleSampleEndpointWithNoConfigurationGet()

UpdateAvailableShows

Sample Description  Requiered Autorizations &#x3D;&gt;  Default Authorization

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import aruppi.client.model.*

val apiInstance = SampleApi()
try {
    apiInstance.apiV0AlphaSampleSampleEndpointWithNoConfigurationGet()
} catch (e: ClientException) {
    println("4xx response calling SampleApi#apiV0AlphaSampleSampleEndpointWithNoConfigurationGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SampleApi#apiV0AlphaSampleSampleEndpointWithNoConfigurationGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure SampleApiKey:
    ApiClient.apiKey["CustomAuth"] = ""
    ApiClient.apiKeyPrefix["CustomAuth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

