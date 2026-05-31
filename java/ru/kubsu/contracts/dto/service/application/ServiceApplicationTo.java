package ru.kubsu.contracts.dto.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.ServiceActionType;
import ru.kubsu.contracts.enums.service.application.ServiceType;

/**
 * DTO заявления на банковскую услугу.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ServiceApplicationTo extends ApplicationTo {

    /** Тип банковской услуги. */
    private ServiceType serviceType;

    /** Наименование банковской услуги. */
    private String serviceName;

    /** Тип действия по услуге. */
    private ServiceActionType actionType;
}
