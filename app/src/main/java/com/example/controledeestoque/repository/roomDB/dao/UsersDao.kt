package com.example.controledeestoque.repository.roomDB.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.controledeestoque.repository.roomDB.entity.Users

@Dao
interface UsersDao {

    @Query("SELECT * FROM users")
    suspend fun loadAll(): List<Users>
    @Insert
    suspend fun insertObj(vararg user: Users)

    @Update
    suspend fun update(user: Users)


    @Delete
    suspend fun delete(user: Users)
}