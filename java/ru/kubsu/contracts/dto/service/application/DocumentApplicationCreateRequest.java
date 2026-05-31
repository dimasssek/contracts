package ru.kubsu.contracts.dto.service.application;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.DocumentDeliveryType;
import ru.kubsu.contracts.enums.service.application.DocumentType;

/**
 * Запрос на создание заявления на получение документа.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class DocumentApplicationCreateRequest extends ApplicationCreateRequest {

    /** Тип запрашиваемого документа. */
    @NotNull
    private DocumentType documentType;

    /** Способ получения документа. */
    private DocumentDeliveryType deliveryType;

    /** Цель получения документа. */
    private String purpose;
}
