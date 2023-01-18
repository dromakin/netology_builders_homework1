/*
 * File:     Db
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

public class Db {

    private DbSetting dbSetting;
    private MyEntity myEntity;

    public Db(DbSetting dbSetting) {
        this.dbSetting = dbSetting;
        myEntity = new MyEntity("first");
        myEntity.setId(UUID.randomUUID());
    }

    public DbSetting getDbSetting() {
        return dbSetting;
    }

    public MyEntity getMyEntity() {
        return myEntity;
    }

    public void setMyEntity(MyEntity myEntity) {
        this.myEntity = myEntity;
    }

}
