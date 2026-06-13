package ru.kubsu.contracts.messaging.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.ClaimType;

import java.util.UUID;

/**
 * Сообщение для витрины report_claim_application.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ClaimApplicationReportMessage {

    /** Идентификатор заявления. */
    private UUID applicationId;

    /** Тип претензии или обращения. */
    private ClaimType claimType;

    /** Предмет претензии или обращения. */
    private String claimSubject;

    /** Описание претензии или обращения. */
    private String description;

    /** Внешняя ссылка на операцию, договор или иной объект. */
    private String externalRef;
}
