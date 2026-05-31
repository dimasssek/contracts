package ru.kubsu.contracts.dto.service.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Метаинформация о странице данных.
 *
 * @deprecated используйте {@link ru.kubsu.contracts.dto.common.PageMetaData}
 */
@Deprecated
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class PageMetaData extends ru.kubsu.contracts.dto.common.PageMetaData {
}
