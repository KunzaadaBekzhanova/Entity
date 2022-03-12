package kg.tutorialapp.entity

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase


@Database(entities = [Employee::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun employeeDao(): EmployeeDao?
}