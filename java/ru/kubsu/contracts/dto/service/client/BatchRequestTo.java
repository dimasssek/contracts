package ru.kubsu.contracts.dto.service.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Транспортный объект пакетного запроса.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class BatchRequestTo {

    /** Идентификатор пакетного запроса. */
    private UUID id;

    /** Идентификатор сообщения пачки. */
    private UUID messageId;

    /** Дата создания пачки. */
    private OffsetDateTime createdDate;

    /** Количество записей в пачке. */
    private Integer messageCount;

    /** Запросы внутри пачки. */
    private List<RequestTo> requests;
}
