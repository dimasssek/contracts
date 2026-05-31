package ru.kubsu.contracts.dto.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.ApplicationStatusBusiness;
import ru.kubsu.contracts.enums.service.client.Gender;

import java.time.LocalDate;
import java.time.OffsetDateTime;

/**
 * Базовые параметры поиска заявлений с пагинацией и сортировкой.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class BaseApplicationQueryParams {

    /** Бизнес-статус заявления. */
    private ApplicationStatusBusiness statusBusiness;

    /** Номер заявления (частичное совпадение). */
    private String number;

    /** Начало диапазона даты создания заявления. */
    private OffsetDateTime createdDateFrom;

    /** Конец диапазона даты создания заявления. */
    private OffsetDateTime createdDateTo;

    /** Фамилия клиента (частичное совпадение). */
    private String lastName;

    /** Имя клиента (частичное совпадение). */
    private String firstName;

    /** Отчество клиента (частичное совпадение). */
    private String patronymic;

    /** Серия документа клиента. */
    private String identityDocumentSeries;

    /** Номер документа клиента. */
    private String identityDocumentNumber;

    /** ИНН клиента. */
    private String itn;

    /** СНИЛС клиента. */
    private String insuranceNumber;

    /** Дата рождения клиента. */
    private LocalDate birthDate;

    /** Пол клиента. */
    private Gender gender;

    /** Номер страницы (0-based). */
    private Integer pageNo;

    /** Размер страницы. */
    private Integer pageSize;

    /** Ключ сортировки в формате "field,asc|desc". */
    private String sortKey;
}
