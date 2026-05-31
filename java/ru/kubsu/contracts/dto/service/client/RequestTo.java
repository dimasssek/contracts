package ru.kubsu.contracts.dto.service.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.client.Gender;
import ru.kubsu.contracts.enums.service.client.RequestOutcome;
import ru.kubsu.contracts.enums.service.client.RequestStatus;
import ru.kubsu.contracts.enums.service.client.RequestType;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Транспортный объект запроса по клиенту.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class RequestTo {

    /** Идентификатор запроса. */
    private UUID id;

    /** Идентификатор клиента (null для MANUAL). */
    private UUID clientId;

    /** Идентификатор сообщения (correlationId). */
    private UUID messageId;

    /** Статус запроса. */
    private RequestStatus status;

    /** Детализация ошибки. */
    private String errorMessage;

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

    /** Тип запроса. */
    private RequestType type;

    /** Итог обработки ответа ведомства. */
    private RequestOutcome outcome;
}
