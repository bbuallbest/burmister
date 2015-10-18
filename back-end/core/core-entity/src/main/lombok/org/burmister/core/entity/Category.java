package org.burmister.core.entity;

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
public class Category {
    Long id;
    String name;
    String description;
    Category parent;
    Community community;
    Date createdAt;
    User createdBy;
    Date modifiedAt;
    User modifiedBy;
}
