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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * Values: Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday,Unknown,Other
 */

@JsonClass(generateAdapter = false)
enum class Days(val value: kotlin.String) {

    @Json(name = "Monday")
    Monday("Monday"),

    @Json(name = "Tuesday")
    Tuesday("Tuesday"),

    @Json(name = "Wednesday")
    Wednesday("Wednesday"),

    @Json(name = "Thursday")
    Thursday("Thursday"),

    @Json(name = "Friday")
    Friday("Friday"),

    @Json(name = "Saturday")
    Saturday("Saturday"),

    @Json(name = "Sunday")
    Sunday("Sunday"),

    @Json(name = "Unknown")
    Unknown("Unknown"),

    @Json(name = "Other")
    Other("Other");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is Days) "$data" else null

        /**
         * Returns a valid [Days] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): Days? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
