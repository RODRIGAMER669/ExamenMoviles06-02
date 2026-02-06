package it.etg.pmpm.game.examen0602.room

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface VideojuegoDao {
    @Query("SELECT id, title, thumbnail from videojuego")
    suspend fun getAll():List<VideojuegoEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(videojuego: VideojuegoEntity)
}