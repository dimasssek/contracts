package ru.kubsu.contracts.dto.service.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.client.RequestStatus;
import ru.kubsu.contracts.enums.service.client.SourceType;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Агрегированный транспортный объект внешнего запроса.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ExternalRequestTo {

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

    /** Пакетные запросы. */
    private List<BatchRequestTo> batches;

    /** Сводка по итогам обработки запросов. */
    private ExternalRequestSummaryTo summary;
}
