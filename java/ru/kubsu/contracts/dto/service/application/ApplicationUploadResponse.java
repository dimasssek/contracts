package ru.kubsu.contracts.dto.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Результат загрузки файла с заявлениями.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ApplicationUploadResponse {

    /** Признак успешной загрузки и создания заявлений из файла. */
    private boolean uploaded;

    /** Подробное описание ошибки для отображения на UI. */
    private String detailedError;
}
