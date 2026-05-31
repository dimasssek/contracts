package ru.kubsu.contracts.dto.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.ClaimType;

/**
 * DTO заявления-претензии или обращения клиента.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ClaimApplicationTo extends ApplicationTo {

    /** Тип претензии или обращения. */
    private ClaimType claimType;

    /** Предмет претензии или обращения. */
    private String claimSubject;

    /** Описание претензии или обращения. */
    private String description;

    /** Внешняя ссылка на операцию, договор или иной объект. */
    private String externalRef;
}
