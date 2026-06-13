package ru.kubsu.contracts.messaging.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.ServiceActionType;
import ru.kubsu.contracts.enums.service.application.ServiceType;

import java.util.UUID;

/**
 * Сообщение для витрины report_service_application.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ServiceApplicationReportMessage {

    /** Идентификатор заявления. */
    private UUID applicationId;

    /** Тип банковской услуги. */
    private ServiceType serviceType;

    /** Наименование банковской услуги. */
    private String serviceName;

    /** Тип действия по услуге. */
    private ServiceActionType actionType;
}
