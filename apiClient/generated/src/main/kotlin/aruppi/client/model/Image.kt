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

import aruppi.client.model.ShowImage

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param showId 
 * @param medium 
 * @param original 
 * @param showImages 
 */


data class Image (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "showId")
    val showId: java.util.UUID? = null,

    @Json(name = "medium")
    val medium: kotlin.String? = null,

    @Json(name = "original")
    val original: kotlin.String? = null,

    @Json(name = "showImages")
    val showImages: kotlin.collections.List<ShowImage>? = null

)

