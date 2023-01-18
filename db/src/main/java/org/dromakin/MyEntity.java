/*
 * File:     MyEntity
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

public class MyEntity {

    private UUID id;
    private String name;

    public MyEntity(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("MyEntity{").append("id=").append(id).append(", name='").append(name).append('\'').append('}').toString();
    }

}
