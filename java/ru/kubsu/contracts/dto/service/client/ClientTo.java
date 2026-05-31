package ru.kubsu.contracts.dto.service.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.client.ClientStatus;
import ru.kubsu.contracts.enums.service.client.Gender;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Транспортный объект клиента для REST-ответов.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ClientTo {

    /** Уникальный идентификатор клиента. */
    private UUID id;

    /** Фамилия. */
    private String lastName;

    /** Имя. */
    private String firstName;

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

    /** Последняя дата обновления записи. */
    private OffsetDateTime actualDate;

    /** Признак определённости адреса. */
    private boolean addressDefined;

    /** Адрес места жительства. */
    private String residenceAddressName;

    /** Статус клиента. */
    private ClientStatus status;
}
