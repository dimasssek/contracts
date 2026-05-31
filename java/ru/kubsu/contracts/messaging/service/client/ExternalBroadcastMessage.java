package ru.kubsu.contracts.messaging.service.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.client.Gender;
import ru.kubsu.contracts.enums.service.client.SourceType;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Рассылка данных клиента от ведомства без предварительного запроса.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ExternalBroadcastMessage {

    /** Тип внешнего источника. */
    private SourceType sourceType;

    /** Идентификатор сообщения рассылки. */
    private UUID messageId;

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

    /** Адрес места жительства. */
    private String residenceAddressName;

    /** Дата актуальности данных. */
    private OffsetDateTime actualDate;
}
