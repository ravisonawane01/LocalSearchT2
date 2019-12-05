package com.example.ravi.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.ravi.network.model.Example;
import com.example.ravi.network.model.Resultarray;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

/**
 * Created by user on 10/23/2018.
 */

@Dao
public interface NoteDao {

    /*@Insert
    void insert(Resultarray resultarray);*/

    @Insert
    Completable insertAll(Example example);

   /* @Update
    void update(Resultarray resultarray);*/

    @Query("SELECT * FROM tips_table")
    Single<Example> getAllTips();
}
