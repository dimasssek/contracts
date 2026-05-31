package ru.kubsu.contracts.dto.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.ClaimType;

/**
 * Параметры поиска заявлений-претензий или обращений клиента.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ClaimApplicationQueryParams extends BaseApplicationQueryParams {

    /** Тип претензии или обращения. */
    private ClaimType claimType;

    /** Предмет претензии или обращения (частичное совпадение). */
    private String claimSubject;
}
