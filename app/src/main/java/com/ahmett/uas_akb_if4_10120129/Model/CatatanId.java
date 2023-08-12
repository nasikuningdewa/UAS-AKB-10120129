package com.ahmett.uas_akb_if4_10120129.Model;

// 10120129, Ahmad Syafii Assidiq, IF4

import androidx.annotation.NonNull;

import com.google.firebase.database.Exclude;

public class CatatanId {
    @Exclude
    public String CatatanId;

    public <T extends CatatanId> T withId(@NonNull final String id){
        this.CatatanId = id;
        return (T) this;
    }

}
