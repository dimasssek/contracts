package ru.kubsu.contracts.dto.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.ApplicationStatusBusiness;
import ru.kubsu.contracts.enums.service.application.ApplicationType;

import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * Результат пакетной обработки заявлений (general-check).
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class GeneralCheckResponse {

    /** Идентификатор запуска general-check. */
    private UUID id;

    /** Тип обработанных заявлений. */
    private ApplicationType applicationType;

    /** Верхняя граница даты создания заявления (включительно). */
    private OffsetDateTime dateTo;

    /** Количество обработанных заявлений. */
    private int processedCount;

    /** Количество заявлений по бизнес-статусам после обработки. */
    private Map<ApplicationStatusBusiness, Integer> statusCounts;
}
