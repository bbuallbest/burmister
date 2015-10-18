package org.burmister.core.persistence.mapper;

import org.burmister.core.entity.Change;

/**
 * @author Kyrylo Berehovyi
 */
public interface ChangeMapper {
    Change getChangeById(Long id);
    void insert(Change change);
}
