package com.destiny.services.fighter;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.destiny.dao.FighterDao;
import com.destiny.entities.fighter.FighterEntity;

@Service("fighterService")
public class FighterService {

    @Autowired
    private FighterDao fighterDao;

    @Transactional
    public List<FighterEntity> findAll() {
        return fighterDao.findAll();
    }

}
