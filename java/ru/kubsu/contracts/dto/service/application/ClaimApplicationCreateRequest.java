package ru.kubsu.contracts.dto.service.application;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.ClaimType;

/**
 * Запрос на создание заявления-претензии или обращения клиента.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ClaimApplicationCreateRequest extends ApplicationCreateRequest {

    /** Тип претензии или обращения. */
    @NotNull
    private ClaimType claimType;

    /** Предмет претензии или обращения. */
    @NotBlank
    private String claimSubject;

    /** Описание претензии или обращения. */
    private String description;

    /** Внешняя ссылка на операцию, договор или иной объект. */
    private String externalRef;
}
