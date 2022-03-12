package kg.tutorialapp.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey




@Entity
class Employee {
    @PrimaryKey
    var id: Long = 0

    var name: String? = null

    var salary = 0
}