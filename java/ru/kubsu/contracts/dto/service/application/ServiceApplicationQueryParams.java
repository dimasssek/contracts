package ru.kubsu.contracts.dto.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.ServiceActionType;
import ru.kubsu.contracts.enums.service.application.ServiceType;

/**
 * Параметры поиска заявлений на банковскую услугу.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ServiceApplicationQueryParams extends BaseApplicationQueryParams {

    /** Тип банковской услуги. */
    private ServiceType serviceType;

    /** Наименование банковской услуги (частичное совпадение). */
    private String serviceName;

    /** Тип действия по услуге. */
    private ServiceActionType actionType;
}
