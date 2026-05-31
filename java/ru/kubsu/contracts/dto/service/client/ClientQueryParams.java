package ru.kubsu.contracts.dto.service.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.client.ClientStatus;
import ru.kubsu.contracts.enums.service.client.Gender;

import java.time.LocalDate;
import java.util.Set;

/**
 * Параметры поиска клиентов с пагинацией и сортировкой.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ClientQueryParams {

    /** Фамилия (частичное совпадение). */
    private String lastName;

    /** Имя (частичное совпадение). */
    private String firstName;

    /** Отчество (частичное совпадение). */
    private String patronymic;

    /** Дата рождения. */
    private LocalDate birthDate;

    /** Пол. */
    private Gender gender;

    /** Статусы клиентов для фильтрации. */
    private Set<ClientStatus> statuses;

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

    /** Адрес места жительства (частичное совпадение). */
    private String residenceAddressName;

    /** Номер страницы (0-based). */
    private Integer pageNo;

    /** Размер страницы. */
    private Integer pageSize;

    /** Ключ сортировки в формате "field,asc|desc". */
    private String sortKey;
}
