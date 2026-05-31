package ru.kubsu.contracts.dto.service.application;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.ServiceActionType;
import ru.kubsu.contracts.enums.service.application.ServiceType;

/**
 * Запрос на обновление заявления на банковскую услугу.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ServiceApplicationUpdateRequest extends ApplicationUpdateRequest {

    /** Тип банковской услуги. */
    @NotNull
    private ServiceType serviceType;

    /** Наименование банковской услуги. */
    @NotBlank
    private String serviceName;

    /** Тип действия по услуге. */
    @NotNull
    private ServiceActionType actionType;
}
