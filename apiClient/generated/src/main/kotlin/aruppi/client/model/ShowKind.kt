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

import aruppi.client.model.Kind
import aruppi.client.model.Show

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param showId 
 * @param kindId 
 * @param kind 
 * @param show 
 */


data class ShowKind (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "showId")
    val showId: java.util.UUID? = null,

    @Json(name = "kindId")
    val kindId: java.util.UUID? = null,

    @Json(name = "kind")
    val kind: Kind? = null,

    @Json(name = "show")
    val show: Show? = null

)
