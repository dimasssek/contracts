package ru.kubsu.contracts.dto.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.ApplicationStatusBusiness;
import ru.kubsu.contracts.enums.service.application.ApplicationStatusInternal;
import ru.kubsu.contracts.enums.service.application.ApplicationType;
import ru.kubsu.contracts.enums.service.application.Channel;
import ru.kubsu.contracts.enums.service.client.Gender;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Базовое DTO заявления клиента.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ApplicationTo {

    /** Идентификатор заявления. */
    private UUID id;

    /** Идентификатор клиента (заполняется после post-processing). */
    private UUID clientId;

    /** Номер заявления. */
    private String number;

    /** Тип заявления. */
    private ApplicationType applicationType;

    /** Канал подачи заявления. */
    private Channel channel;

    /** Внутренний статус заявления. */
    private ApplicationStatusInternal statusInternal;

    /** Бизнес-статус заявления. */
    private ApplicationStatusBusiness statusBusiness;

    /** Причина статуса из status_inform. */
    private String reason;

    /** Дата создания заявления. */
    private OffsetDateTime createdDate;

    /** Дата закрытия заявления. */
    private OffsetDateTime closedDate;

    /** Фамилия клиента на момент подачи заявления. */
    private String lastName;

    /** Имя клиента на момент подачи заявления. */
    private String firstName;

    /** Отчество клиента на момент подачи заявления. */
    private String patronymic;

    /** Дата рождения клиента на момент подачи заявления. */
    private LocalDate birthDate;

    /** Пол клиента на момент подачи заявления. */
    private Gender gender;

    /** Серия документа клиента на момент подачи заявления. */
    private String identityDocumentSeries;

    /** Номер документа клиента на момент подачи заявления. */
    private String identityDocumentNumber;

    /** ИНН клиента на момент подачи заявления. */
    private String itn;

    /** СНИЛС клиента на момент подачи заявления. */
    private String insuranceNumber;
}
