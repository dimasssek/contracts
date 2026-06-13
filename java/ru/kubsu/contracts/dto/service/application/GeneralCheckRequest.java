package ru.kubsu.contracts.dto.service.application;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.ApplicationType;

import java.time.OffsetDateTime;

/**
 * Запрос на пакетную обработку заявлений (general-check).
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class GeneralCheckRequest {

    /** Тип заявлений для обработки. */
    @NotNull
    private ApplicationType applicationType;

    /** Верхняя граница даты создания заявления (включительно). */
    @NotNull
    private OffsetDateTime dateTo;
}
