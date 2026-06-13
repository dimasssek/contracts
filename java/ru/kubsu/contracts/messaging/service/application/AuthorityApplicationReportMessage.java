package ru.kubsu.contracts.messaging.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.AuthorityType;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Сообщение для витрины report_authority_application.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class AuthorityApplicationReportMessage {

    /** Идентификатор заявления. */
    private UUID applicationId;

    /** Тип полномочия или доступа. */
    private AuthorityType authorityType;

    /** ФИО лица, которому предоставляются полномочия. */
    private String personName;

    /** Номер документа, подтверждающего полномочия. */
    private String documentNumber;

    /** Дата окончания действия полномочий. */
    private LocalDate validUntil;
}
