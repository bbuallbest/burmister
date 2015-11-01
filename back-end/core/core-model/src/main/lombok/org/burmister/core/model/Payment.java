package org.burmister.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import org.burmister.core.model.enums.Currency;

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
