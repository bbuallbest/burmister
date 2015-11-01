package org.burmister.core.persistence.dao;

import org.burmister.core.model.Change;
import org.burmister.core.persistence.mapper.ChangeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Kyrylo Berehovyi
 */
@Component
public class ChangeDAO implements ChangeMapper{

    @Autowired
    private ChangeMapper changeMapper;

    public Change getChangeById(Long id) {
        return changeMapper.getChangeById(id);
    }

    public void insert(Change change) {
        changeMapper.insert(change);
    }
}
