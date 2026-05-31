package ru.kubsu.contracts.dto.service.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.client.RequestStatus;
import ru.kubsu.contracts.enums.service.client.SourceType;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Краткий транспортный объект внешнего запроса для списка/поиска.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ExternalRequestListTo {

    /** Уникальный идентификатор внешнего запроса. */
    private UUID id;

    /** Номер исходящего письма. */
    private String letterNumber;

    /** Дата исходящего запроса. */
    private LocalDate letterDate;

    /** Тип внешнего источника-получателя. */
    private SourceType sourceType;

    /** Статус запроса. */
    private RequestStatus status;

    /** Логин пользователя, инициировавшего запрос. */
    private String initiatorLogin;

    /** Дата создания запроса. */
    private OffsetDateTime created;

    /** Количество пакетных запросов. */
    private long batchCount;

    /** Количество запросов по клиентам. */
    private long requestCount;
}
