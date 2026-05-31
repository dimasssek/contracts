package ru.kubsu.contracts.messaging.service.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.client.Gender;
import ru.kubsu.contracts.enums.service.client.RequestType;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Элемент пакетного запроса в сообщении для внешнего источника.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ExternalRequestItemMessage {

    /** Идентификатор запроса. */
    private UUID requestId;

    /** Идентификатор корреляции (message_id). */
    private UUID correlationId;

    /** Идентификатор клиента (null для MANUAL). */
    private UUID clientId;

    /** Тип запроса. */
    private RequestType type;

    /** Имя. */
    private String firstName;

    /** Фамилия. */
    private String lastName;

    /** Отчество. */
    private String patronymic;

    /** Дата рождения. */
    private LocalDate birthDate;

    /** Пол. */
    private Gender gender;

    /** Серия паспорта. */
    private String identityDocumentSeries;

    /** Номер паспорта. */
    private String identityDocumentNumber;

    /** Дата выдачи паспорта. */
    private LocalDate identityDocumentIssueDate;

    /** ИНН. */
    private String itn;

    /** СНИЛС. */
    private String insuranceNumber;
}
