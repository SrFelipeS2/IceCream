package com.example.cursomoviles

import android.app.Activity
import android.icu.text.CaseMap.Title
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AbsListView
import android.widget.EditText
import com.example.cursomoviles.room_database.ToDo
import com.example.cursomoviles.room_database.ToDoDatabase
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class NewTaskActivity : AppCompatActivity() {
    lateinit var editTextTitle: EditText
    lateinit var editTextTime: EditText
    lateinit var editTextPlace: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_task)
        editTextTitle = findViewById(R.id.editTextTitle)
        editTextTime = findViewById(R.id.editTextTime)
        editTextPlace = findViewById(R.id.editTextPlace)
    }

    fun onSave(view:View) {
        val db = ToDoDatabase.getDatabase(this)

        val todoDAO =db.todoDao()
        val task = ToDo(0,editTextTitle.text.toString(),editTextTime.text.toString(),editTextPlace.text.toString())

        runBlocking {
            launch {
                var result = todoDAO.insertTask(task)
                if(result!=-1L){
                    setResult(Activity.RESULT_OK)
                    finish()
                }
            }
        }
    }
}
