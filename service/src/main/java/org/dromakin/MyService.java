/*
 * File:     MyService
 * Package:  org.dromakin
 * Project:  maven_homework
 *
 * Created by dromakin as 18.01.2023
 *
 * author - dromakin
 * maintainer - dromakin
 * version - 2023.01.18
 * copyright - Echelon Inc. 2023
 */

package org.dromakin;

import java.util.UUID;

public class MyService {

    private DbSetting dbSetting = new DbSetting("name", "password");
    private String name = "myService";
    private Db db = new Db(dbSetting);

    public String getName() {
        return name;
    }

    public MyEntity setMyEntity(MyEntity myEntity) {
        myEntity.setId(UUID.randomUUID());
        db.setMyEntity(myEntity);
        return myEntity;
    }

    public MyEntity getMyEntity() {
        return db.getMyEntity();
    }

}
