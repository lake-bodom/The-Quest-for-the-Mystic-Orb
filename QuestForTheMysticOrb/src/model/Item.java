/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Mikel
 */
public class Item implements Serializable{
    
    private String getName;
    private String getDescription;       

    public String getGetName() {
        return getName;
    }

    public void setGetName(String getName) {
        this.getName = getName;
    }

    public String getGetDescription() {
        return getDescription;
    }

    public void setGetDescription(String getDescription) {
        this.getDescription = getDescription;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.getName);
        hash = 89 * hash + Objects.hashCode(this.getDescription);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.getName, other.getName)) {
            return false;
        }
        if (!Objects.equals(this.getDescription, other.getDescription)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "getName=" + getName + ", getDescription=" + getDescription + '}';
    }
    
            
           
} 