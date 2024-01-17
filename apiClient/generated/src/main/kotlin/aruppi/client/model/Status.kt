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

package aruppi.client.model

import aruppi.client.model.ShowStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param name 
 * @param showStatuses 
 */


data class Status (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "showStatuses")
    val showStatuses: kotlin.collections.List<ShowStatus>? = null

)

