package com.codepath.campgrounds

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface CalorieDao {
    @Query("SELECT * FROM calorie_table")
    fun getAll(): Flow<List<CalEntity>>

    @Insert
    fun insertAll(campgrounds: List<CalEntity>)

    @Query("DELETE FROM calorie_table")
    fun deleteAll()
}