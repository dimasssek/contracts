package ru.kubsu.contracts.dto.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.DocumentDeliveryType;
import ru.kubsu.contracts.enums.service.application.DocumentType;

/**
 * DTO заявления на получение документа.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class DocumentApplicationTo extends ApplicationTo {

    /** Тип запрашиваемого документа. */
    private DocumentType documentType;

    /** Способ получения документа. */
    private DocumentDeliveryType deliveryType;

    /** Цель получения документа. */
    private String purpose;
}
