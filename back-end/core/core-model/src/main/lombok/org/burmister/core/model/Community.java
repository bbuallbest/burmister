package org.burmister.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.Date;

/**
 * @author Kyrylo Berehovyi
 */
@Value
@Builder
@AllArgsConstructor
public class Community {
    Long id;
    String name;
    String description;
    Date createdAt;
    User createdBy;
    Date modifiedAt;
    User modifiedBy;
}
