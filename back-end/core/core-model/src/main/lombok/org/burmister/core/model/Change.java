package org.burmister.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

/**
 * @author Kyrylo Berehovyi
 */
@Value
@Builder
@AllArgsConstructor
public class Change {
    Long id;
    String name;
    String description;
}
