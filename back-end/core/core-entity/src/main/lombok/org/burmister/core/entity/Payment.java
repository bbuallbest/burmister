package org.burmister.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import org.burmister.core.entity.enums.Currency;

import java.util.Date;

/**
 * @author Kyrylo Berehovyi
 */
@Value
@Builder
@AllArgsConstructor
public class Payment {
    Long id;
    String name;
    String description;
    Category category;
    Community community;
    Long amount;
    Currency currency;
    Date createdAt;
    User createdBy;
    Date modifiedAt;
    User modifiedBy;
}
