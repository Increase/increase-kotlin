// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * Exports are batch summaries of your Increase data. You can make them from the API or dashboard.
 * Since they can take a while, they are generated asynchronously. We send a webhook when they are
 * ready. For more information, please read our
 * [Exports documentation](https://increase.com/documentation/exports).
 */
@JsonDeserialize(builder = Export.Builder::class)
@NoAutoDetect
class Export
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val category: JsonField<Category>,
    private val status: JsonField<Status>,
    private val fileId: JsonField<String>,
    private val fileDownloadUrl: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The Export identifier. */
    fun id(): String = id.getRequired("id")

    /** The time the Export was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The category of the Export. We may add additional possible values for this enum over time;
     * your application should be able to handle that gracefully.
     */
    fun category(): Category = category.getRequired("category")

    /** The status of the Export. */
    fun status(): Status = status.getRequired("status")

    /**
     * The File containing the contents of the Export. This will be present when the Export's status
     * transitions to `complete`.
     */
    fun fileId(): String? = fileId.getNullable("file_id")

    /**
     * A URL at which the Export's file can be downloaded. This will be present when the Export's
     * status transitions to `complete`.
     */
    fun fileDownloadUrl(): String? = fileDownloadUrl.getNullable("file_download_url")

    /** A constant representing the object's type. For this resource it will always be `export`. */
    fun type(): Type = type.getRequired("type")

    /** The Export identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The time the Export was created. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /**
     * The category of the Export. We may add additional possible values for this enum over time;
     * your application should be able to handle that gracefully.
     */
    @JsonProperty("category") @ExcludeMissing fun _category() = category

    /** The status of the Export. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * The File containing the contents of the Export. This will be present when the Export's status
     * transitions to `complete`.
     */
    @JsonProperty("file_id") @ExcludeMissing fun _fileId() = fileId

    /**
     * A URL at which the Export's file can be downloaded. This will be present when the Export's
     * status transitions to `complete`.
     */
    @JsonProperty("file_download_url") @ExcludeMissing fun _fileDownloadUrl() = fileDownloadUrl

    /** A constant representing the object's type. For this resource it will always be `export`. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Export = apply {
        if (!validated) {
            id()
            createdAt()
            category()
            status()
            fileId()
            fileDownloadUrl()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Export &&
            this.id == other.id &&
            this.createdAt == other.createdAt &&
            this.category == other.category &&
            this.status == other.status &&
            this.fileId == other.fileId &&
            this.fileDownloadUrl == other.fileDownloadUrl &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    createdAt,
                    category,
                    status,
                    fileId,
                    fileDownloadUrl,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Export{id=$id, createdAt=$createdAt, category=$category, status=$status, fileId=$fileId, fileDownloadUrl=$fileDownloadUrl, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var category: JsonField<Category> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var fileId: JsonField<String> = JsonMissing.of()
        private var fileDownloadUrl: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(export: Export) = apply {
            this.id = export.id
            this.createdAt = export.createdAt
            this.category = export.category
            this.status = export.status
            this.fileId = export.fileId
            this.fileDownloadUrl = export.fileDownloadUrl
            this.type = export.type
            additionalProperties(export.additionalProperties)
        }

        /** The Export identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Export identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The time the Export was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The time the Export was created. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The category of the Export. We may add additional possible values for this enum over
         * time; your application should be able to handle that gracefully.
         */
        fun category(category: Category) = category(JsonField.of(category))

        /**
         * The category of the Export. We may add additional possible values for this enum over
         * time; your application should be able to handle that gracefully.
         */
        @JsonProperty("category")
        @ExcludeMissing
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /** The status of the Export. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Export. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * The File containing the contents of the Export. This will be present when the Export's
         * status transitions to `complete`.
         */
        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

        /**
         * The File containing the contents of the Export. This will be present when the Export's
         * status transitions to `complete`.
         */
        @JsonProperty("file_id")
        @ExcludeMissing
        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

        /**
         * A URL at which the Export's file can be downloaded. This will be present when the
         * Export's status transitions to `complete`.
         */
        fun fileDownloadUrl(fileDownloadUrl: String) =
            fileDownloadUrl(JsonField.of(fileDownloadUrl))

        /**
         * A URL at which the Export's file can be downloaded. This will be present when the
         * Export's status transitions to `complete`.
         */
        @JsonProperty("file_download_url")
        @ExcludeMissing
        fun fileDownloadUrl(fileDownloadUrl: JsonField<String>) = apply {
            this.fileDownloadUrl = fileDownloadUrl
        }

        /**
         * A constant representing the object's type. For this resource it will always be `export`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `export`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): Export =
            Export(
                id,
                createdAt,
                category,
                status,
                fileId,
                fileDownloadUrl,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACCOUNT_STATEMENT_OFX = Category(JsonField.of("account_statement_ofx"))

            val TRANSACTION_CSV = Category(JsonField.of("transaction_csv"))

            val BALANCE_CSV = Category(JsonField.of("balance_csv"))

            fun of(value: String) = Category(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_STATEMENT_OFX,
            TRANSACTION_CSV,
            BALANCE_CSV,
        }

        enum class Value {
            ACCOUNT_STATEMENT_OFX,
            TRANSACTION_CSV,
            BALANCE_CSV,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT_STATEMENT_OFX -> Value.ACCOUNT_STATEMENT_OFX
                TRANSACTION_CSV -> Value.TRANSACTION_CSV
                BALANCE_CSV -> Value.BALANCE_CSV
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNT_STATEMENT_OFX -> Known.ACCOUNT_STATEMENT_OFX
                TRANSACTION_CSV -> Known.TRANSACTION_CSV
                BALANCE_CSV -> Known.BALANCE_CSV
                else -> throw IncreaseInvalidDataException("Unknown Category: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PENDING = Status(JsonField.of("pending"))

            val COMPLETE = Status(JsonField.of("complete"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            COMPLETE,
        }

        enum class Value {
            PENDING,
            COMPLETE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                COMPLETE -> Value.COMPLETE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                COMPLETE -> Known.COMPLETE
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val EXPORT = Type(JsonField.of("export"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            EXPORT,
        }

        enum class Value {
            EXPORT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EXPORT -> Value.EXPORT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EXPORT -> Known.EXPORT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
