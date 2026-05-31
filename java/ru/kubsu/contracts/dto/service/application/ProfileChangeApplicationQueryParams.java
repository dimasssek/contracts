package ru.kubsu.contracts.dto.service.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.kubsu.contracts.enums.service.application.ClientChangeType;

/**
 * Параметры поиска заявлений на изменение данных клиента.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ProfileChangeApplicationQueryParams extends BaseApplicationQueryParams {

    /** Тип изменяемых данных. */
    private ClientChangeType changeType;
}
