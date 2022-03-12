package kg.tutorialapp.entity

import android.arch.persistence.room.Room
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database"
        ).build()
        val employeeDao = db.employeeDao()
        val employee = Employee()
        employee.id = 1
        employee.name = "John Smith"
        employee.salary = 10000

        if (employeeDao != null) {
            employeeDao.insert(employee)
        }

        //var db1: AppDatabase = App.getInstance().getDatabase()
        //val employees = employeeDao!!.all //Метод getAll вернет нам всех сотрудников в List<Employee>
        //val employee = employeeDao.getById(1)//Получение сотрудника по id:

       // employee.salary = 20000;
        //employeeDao?.update(employee);//Обновление данных по сотруднику.

        employeeDao?.delete(employee);//Удаление сотрудника


    }
}