package ru.kubsu.contracts.dto.service.client;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * DTO ошибки для REST-ответов client-service.
 *
 * @deprecated используйте {@link ru.kubsu.contracts.dto.common.ErrorResponseTo}
 */
@Deprecated
@Getter
@Setter
@Accessors(chain = true)
public class ErrorResponseTo extends ru.kubsu.contracts.dto.common.ErrorResponseTo {
}
