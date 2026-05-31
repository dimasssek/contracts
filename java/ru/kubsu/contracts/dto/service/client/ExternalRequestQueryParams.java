package ru.kubsu.contracts.dto.service.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.client.RequestStatus;
import ru.kubsu.contracts.enums.service.client.SourceType;

import java.time.LocalDate;
import java.util.Set;

/**
 * Параметры поиска внешних запросов с пагинацией и сортировкой.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ExternalRequestQueryParams {

    /** Номер письма (частичное совпадение). */
    private String letterNumber;

    /** Дата исходящего запроса. */
    private LocalDate letterDate;

    /** Тип внешнего источника. */
    private SourceType sourceType;

    /** Статусы запроса. */
    private Set<RequestStatus> statuses;

    /** Логин инициатора (частичное совпадение). */
    private String initiatorLogin;

    /** Номер страницы (0-based). */
    private Integer pageNo;

    /** Размер страницы. */
    private Integer pageSize;

    /** Ключ сортировки в формате "field,asc|desc". */
    private String sortKey;
}
