package com.bdjobs.realmdbtest.RealmModelClass;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Required;

/**
 * Created by Tabriz on 28-Apr-16.
 */
public class Person extends RealmObject {
    @Required // Name is not nullable
    private String name;
    private String imageUrl; // imageUrl is an optional field

    public RealmList<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(RealmList<Dog> dogs) {
        this.dogs = dogs;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private RealmList<Dog> dogs;



}
