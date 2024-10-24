package com.stu71954.roomdbassignment3.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.stu71954.roomdbassignment3.Todo

@Dao
 interface TodoDao {
   @Query("SELECT * FROM Todo ORDER BY createdAt DESC")
    fun getAllTodos() : LiveData<List<Todo>>

    @Insert
    fun addTodo(todo: Todo)

    @Query("DELETE FROM TODO WHERE id = :id")
    fun deleteTodo(id: Int)
}