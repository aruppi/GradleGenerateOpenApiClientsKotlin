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

import aruppi.api.client.model.OrderDirection
import aruppi.api.client.model.ShowTempColumns

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param direction 
 * @param column 
 */


data class ShowTempColumnsOrderBy (

    @Json(name = "direction")
    val direction: OrderDirection? = null,

    @Json(name = "column")
    val column: ShowTempColumns? = null

)

