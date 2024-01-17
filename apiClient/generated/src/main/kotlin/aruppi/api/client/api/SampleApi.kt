/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package aruppi.api.client.api

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl


import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class SampleApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost:5001")
        }
    }

    /**
     * UpdateAvailableShows
     * Sample Description  Requiered Autorizations &#x3D;&gt;  Policies: SamplePolicy, Other  Roles: SampleRole, Others  
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV0AlphaSampleSampleEndpointWithCustomPoliciesAndRolesGet() : Unit {
        val localVarResponse = apiV0AlphaSampleSampleEndpointWithCustomPoliciesAndRolesGetWithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * UpdateAvailableShows
     * Sample Description  Requiered Autorizations &#x3D;&gt;  Policies: SamplePolicy, Other  Roles: SampleRole, Others  
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV0AlphaSampleSampleEndpointWithCustomPoliciesAndRolesGetWithHttpInfo() : ApiResponse<Unit?> {
        val localVariableConfig = apiV0AlphaSampleSampleEndpointWithCustomPoliciesAndRolesGetRequestConfig()

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV0AlphaSampleSampleEndpointWithCustomPoliciesAndRolesGet
     *
     * @return RequestConfig
     */
    fun apiV0AlphaSampleSampleEndpointWithCustomPoliciesAndRolesGetRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v0-alpha/Sample/SampleEndpointWithCustomPoliciesAndRoles",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * UpdateAvailableShows
     * Sample Description  Requiered Autorizations &#x3D;&gt;  Default Authorization
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV0AlphaSampleSampleEndpointWithNoConfigurationGet() : Unit {
        val localVarResponse = apiV0AlphaSampleSampleEndpointWithNoConfigurationGetWithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * UpdateAvailableShows
     * Sample Description  Requiered Autorizations &#x3D;&gt;  Default Authorization
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV0AlphaSampleSampleEndpointWithNoConfigurationGetWithHttpInfo() : ApiResponse<Unit?> {
        val localVariableConfig = apiV0AlphaSampleSampleEndpointWithNoConfigurationGetRequestConfig()

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV0AlphaSampleSampleEndpointWithNoConfigurationGet
     *
     * @return RequestConfig
     */
    fun apiV0AlphaSampleSampleEndpointWithNoConfigurationGetRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v0-alpha/Sample/SampleEndpointWithNoConfiguration",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
