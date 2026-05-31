package ru.kubsu.contracts.dto.service.client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.client.Gender;

import java.time.LocalDate;

/**
 * Запрос на создание клиента.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ClientCreateRequest {

    /** Фамилия. */
    @NotBlank
    private String lastName;

    /** Имя. */
    @NotBlank
    private String firstName;

    /** Отчество. */
    private String patronymic;

    /** Дата рождения. */
    @NotNull
    private LocalDate birthDate;

    /** Пол. */
    @NotNull
    private Gender gender;

    /** Серия паспорта. */
    @NotBlank
    private String identityDocumentSeries;

    /** Номер паспорта. */
    private String identityDocumentNumber;

    /** Дата выдачи паспорта. */
    private LocalDate identityDocumentIssueDate;

    /** ИНН. */
    private String itn;

    /** СНИЛС. */
    private String insuranceNumber;

    /** Признак определённости адреса. */
    private boolean addressDefined;

    /** Адрес места жительства. */
    @NotBlank
    private String residenceAddressName;
}
