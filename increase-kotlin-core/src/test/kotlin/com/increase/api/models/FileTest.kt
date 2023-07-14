package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FileTest {

    @Test
    fun createFile() {
        val file =
            File.builder()
                .id("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("string")
                .direction(File.Direction.TO_INCREASE)
                .downloadUrl("string")
                .filename("string")
                .purpose(File.Purpose.CHECK_IMAGE_FRONT)
                .type(File.Type.FILE)
                .build()
        assertThat(file).isNotNull
        assertThat(file.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(file.id()).isEqualTo("string")
        assertThat(file.purpose()).isEqualTo(File.Purpose.CHECK_IMAGE_FRONT)
        assertThat(file.description()).isEqualTo("string")
        assertThat(file.direction()).isEqualTo(File.Direction.TO_INCREASE)
        assertThat(file.filename()).isEqualTo("string")
        assertThat(file.downloadUrl()).isEqualTo("string")
        assertThat(file.type()).isEqualTo(File.Type.FILE)
    }
}
