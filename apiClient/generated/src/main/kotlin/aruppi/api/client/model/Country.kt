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

package aruppi.api.client.model

import aruppi.api.client.model.CountryNetwork

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param name 
 * @param code 
 * @param timezone 
 * @param countryNetworks 
 */


data class Country (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "code")
    val code: kotlin.String? = null,

    @Json(name = "timezone")
    val timezone: kotlin.String? = null,

    @Json(name = "countryNetworks")
    val countryNetworks: kotlin.collections.List<CountryNetwork>? = null

)

