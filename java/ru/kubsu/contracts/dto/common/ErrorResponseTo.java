package ru.kubsu.contracts.dto.common;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * DTO ошибки для REST-ответов микросервисов.
 */
@Getter
@Setter
@Accessors(chain = true)
public class ErrorResponseTo {

    /** Код ошибки для парсинга на стороне других сервисов. */
    private String code;

    /** Человекочитаемое описание ошибки. */
    private String message;
}
