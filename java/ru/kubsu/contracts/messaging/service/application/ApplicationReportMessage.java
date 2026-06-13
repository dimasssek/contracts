package ru.kubsu.contracts.messaging.service.application;

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
 * Сообщение для витрины report_application.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ApplicationReportMessage {

    /** Идентификатор заявления. */
    private UUID id;

    /** Идентификатор клиента. */
    private UUID clientId;

    /** Номер заявления. */
    private String number;

    /** Тип заявления. */
    private ApplicationType applicationType;

    /** Канал подачи заявления. */
    private Channel channel;

    /** Бизнес-статус заявления. */
    private ApplicationStatusBusiness statusBusiness;

    /** Внутренний статус заявления. */
    private ApplicationStatusInternal statusInternal;

    /** Текст причины статуса из status_inform. */
    private String reason;

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

    /** Дата создания заявления. */
    private OffsetDateTime createdDate;

    /** Дата закрытия заявления. */
    private OffsetDateTime closedDate;

    /** Признак мягкого удаления. */
    private boolean deleted;
}
