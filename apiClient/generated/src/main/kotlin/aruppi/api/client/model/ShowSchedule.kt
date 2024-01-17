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

import aruppi.api.client.model.ScheduleDay
import aruppi.api.client.model.Show

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param showId 
 * @param time 
 * @param scheduleDays 
 * @param show 
 */


data class ShowSchedule (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "showId")
    val showId: java.util.UUID? = null,

    @Json(name = "time")
    val time: kotlin.String? = null,

    @Json(name = "scheduleDays")
    val scheduleDays: kotlin.collections.List<ScheduleDay>? = null,

    @Json(name = "show")
    val show: Show? = null

)

