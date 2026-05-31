package ru.kubsu.contracts.dto.service.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Сводка по итогам обработки внешнего запроса.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ExternalRequestSummaryTo {

    /** Количество запросов в ожидании ответа. */
    private long pendingCount;

    /** Количество запросов с обновлёнными данными клиента. */
    private long updatedCount;

    /** Количество запросов с актуальными данными. */
    private long actualCount;

    /** Количество запросов, по которым ведомство ничего не нашло. */
    private long notFoundCount;

    /** Количество запросов с ошибкой. */
    private long errorCount;
}
