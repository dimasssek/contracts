package ru.kubsu.contracts.messaging.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.DocumentDeliveryType;
import ru.kubsu.contracts.enums.service.application.DocumentType;

import java.util.UUID;

/**
 * Сообщение для витрины report_document_application.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class DocumentApplicationReportMessage {

    /** Идентификатор заявления. */
    private UUID applicationId;

    /** Тип запрашиваемого документа. */
    private DocumentType documentType;

    /** Способ получения документа. */
    private DocumentDeliveryType deliveryType;

    /** Цель получения документа. */
    private String purpose;
}
