package ru.kubsu.contracts.dto.service.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Страница данных с метаинформацией.
 *
 * @param <T> тип транспортного объекта
 * @deprecated используйте {@link ru.kubsu.contracts.dto.common.PageData}
 */
@Deprecated
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class PageData<T> extends ru.kubsu.contracts.dto.common.PageData<T> {
}
