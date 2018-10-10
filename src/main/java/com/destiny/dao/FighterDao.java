package com.destiny.dao;

import org.springframework.stereotype.Repository;
import com.destiny.entities.fighter.FighterEntity;

@Repository
public class FighterDao extends GenericDao<FighterEntity> {

    @Override
    protected Class<FighterEntity> getClassType() {
        return FighterEntity.class;
    }

}
