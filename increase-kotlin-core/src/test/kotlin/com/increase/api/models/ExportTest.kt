package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExportTest {

    @Test
    fun createExport() {
        val export =
            Export.builder()
                .id("string")
                .category(Export.Category.TRANSACTION_CSV)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fileDownloadUrl("string")
                .fileId("string")
                .status(Export.Status.PENDING)
                .type(Export.Type.EXPORT)
                .build()
        assertThat(export).isNotNull
        assertThat(export.id()).isEqualTo("string")
        assertThat(export.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(export.category()).isEqualTo(Export.Category.TRANSACTION_CSV)
        assertThat(export.status()).isEqualTo(Export.Status.PENDING)
        assertThat(export.fileId()).isEqualTo("string")
        assertThat(export.fileDownloadUrl()).isEqualTo("string")
        assertThat(export.type()).isEqualTo(Export.Type.EXPORT)
    }
}
