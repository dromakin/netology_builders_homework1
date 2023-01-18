/*
 * File:     DbSetting
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

public class DbSetting {

    private String name;
    private String password;

    public DbSetting(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
