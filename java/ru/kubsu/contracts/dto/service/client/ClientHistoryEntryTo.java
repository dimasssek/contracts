package ru.kubsu.contracts.dto.service.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.client.RequestOutcome;
import ru.kubsu.contracts.enums.service.client.RequestStatus;
import ru.kubsu.contracts.enums.service.client.SourceType;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Запись истории запросов клиента во внешние ведомства.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ClientHistoryEntryTo {

    /** Идентификатор внешнего запроса. */
    private UUID externalRequestId;

    /** Номер исходящего письма. */
    private String letterNumber;

    /** Тип внешнего источника. */
    private SourceType sourceType;

    /** Статус внешнего запроса. */
    private RequestStatus externalRequestStatus;

    /** Дата создания внешнего запроса. */
    private OffsetDateTime externalRequestCreated;

    /** Идентификатор запроса по клиенту. */
    private UUID requestId;

    /** Статус запроса. */
    private RequestStatus requestStatus;

    /** Итог обработки ответа ведомства. */
    private RequestOutcome outcome;
}
