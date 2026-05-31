package ru.kubsu.contracts.messaging.service.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.client.SourceType;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

/**
 * Сообщение пакетного запроса для публикации во внешний источник через outbox.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ExternalRequestBatchMessage {

    /** Идентификатор пакетного запроса. */
    private UUID batchRequestId;

    /** Идентификатор внешнего запроса. */
    private UUID externalRequestId;

    /** Идентификатор сообщения пачки. */
    private UUID batchMessageId;

    /** Тип внешнего источника. */
    private SourceType sourceType;

    /** Номер исходящего письма. */
    private String letterNumber;

    /** Дата исходящего запроса. */
    private LocalDate letterDate;

    /** Записи запроса внутри пачки. */
    private List<ExternalRequestItemMessage> items;
}
