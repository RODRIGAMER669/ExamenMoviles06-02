package it.etg.pmpm.game.examen0602.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "videojuego")
data class VideojuegoEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var title: String = "",
    var thumbnail: String = ""
)
