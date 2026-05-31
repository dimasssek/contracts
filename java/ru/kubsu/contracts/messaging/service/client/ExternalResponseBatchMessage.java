package ru.kubsu.contracts.messaging.service.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.client.SourceType;

import java.util.List;
import java.util.UUID;

/**
 * Пачка ответа ведомства на исходящий пакетный запрос.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ExternalResponseBatchMessage {

    /** Идентификатор пакетного запроса, на который получен ответ. */
    private UUID batchRequestId;

    /** Идентификатор сообщения ответа. */
    private UUID batchMessageId;

    /** Тип внешнего источника. */
    private SourceType sourceType;

    /** Элементы ответа по correlationId. */
    private List<ExternalResponseItemMessage> items;
}
