// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.filelinks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileLinkTest {

    @Test
    fun create() {
        val fileLink =
            FileLink.builder()
                .id("file_link_roapsuicj7kp1lzyus04")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .expiresAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .fileId("file_makxrc67oh9l6sg7w9yc")
                .idempotencyKey(null)
                .type(FileLink.Type.FILE_LINK)
                .unauthenticatedUrl("https://example.com/file.pdf")
                .build()

        assertThat(fileLink.id()).isEqualTo("file_link_roapsuicj7kp1lzyus04")
        assertThat(fileLink.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(fileLink.expiresAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(fileLink.fileId()).isEqualTo("file_makxrc67oh9l6sg7w9yc")
        assertThat(fileLink.idempotencyKey()).isNull()
        assertThat(fileLink.type()).isEqualTo(FileLink.Type.FILE_LINK)
        assertThat(fileLink.unauthenticatedUrl()).isEqualTo("https://example.com/file.pdf")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileLink =
            FileLink.builder()
                .id("file_link_roapsuicj7kp1lzyus04")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .expiresAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .fileId("file_makxrc67oh9l6sg7w9yc")
                .idempotencyKey(null)
                .type(FileLink.Type.FILE_LINK)
                .unauthenticatedUrl("https://example.com/file.pdf")
                .build()

        val roundtrippedFileLink =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileLink),
                jacksonTypeRef<FileLink>(),
            )

        assertThat(roundtrippedFileLink).isEqualTo(fileLink)
    }
}
