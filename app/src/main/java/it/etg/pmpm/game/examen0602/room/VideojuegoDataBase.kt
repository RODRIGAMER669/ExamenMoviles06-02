package it.etg.pmpm.game.examen0602.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [VideojuegoEntity::class], version = 1)
abstract class VideojuegoDataBase: RoomDatabase() {
    abstract fun videojuegoDao(): VideojuegoDao
}