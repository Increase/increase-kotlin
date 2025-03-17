// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.files

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileTest {

    @Test
    fun createFile() {
        val file =
            File.builder()
                .id("file_makxrc67oh9l6sg7w9yc")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .description("2022-05 statement for checking account")
                .direction(File.Direction.TO_INCREASE)
                .filename("statement.pdf")
                .idempotencyKey(null)
                .mimeType("application/pdf")
                .purpose(File.Purpose.CHECK_IMAGE_FRONT)
                .type(File.Type.FILE)
                .build()
        assertThat(file).isNotNull
        assertThat(file.id()).isEqualTo("file_makxrc67oh9l6sg7w9yc")
        assertThat(file.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(file.description()).isEqualTo("2022-05 statement for checking account")
        assertThat(file.direction()).isEqualTo(File.Direction.TO_INCREASE)
        assertThat(file.filename()).isEqualTo("statement.pdf")
        assertThat(file.idempotencyKey()).isNull()
        assertThat(file.mimeType()).isEqualTo("application/pdf")
        assertThat(file.purpose()).isEqualTo(File.Purpose.CHECK_IMAGE_FRONT)
        assertThat(file.type()).isEqualTo(File.Type.FILE)
    }
}
