package demo.kotlinapp.com.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.widget.Button
import android.widget.Toast
import android.R.attr.button
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.LinearLayout


class MainActivity : AppCompatActivity() {
    companion object{

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     //   val toolbar = findViewById(R.id.toolbar) as Toolbar
      //  setSupportActionBar(toolbar)

        //val button = findViewById(R.id.button) as Button
       /* button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                Toast.makeText(v.getContext(), "Click", Toast.LENGTH_SHORT).show()
            }
        })
        button.setOnClickListener {
            Toast.makeText(MainActivity@this, "clecled me", Toast.LENGTH_LONG).show()
        }*/
     //   button.setOnClickListener({ view -> toast("Click")})
// https://antonioleiva.com/functional-programming-android-kotlin-lambdas/
        //  val fab = findViewById(R.id.fab) as FloatingActionButton
       // fab.setOnClickListener { view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show() }
        //getting recyclerview from xml
val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL, false)


        //crating an arraylist to store users using the data class user
        val users = ArrayList<User>()

        //adding some dummy data to the list
        users.add(User("Belal Khan", "Ranchi Jharkhand"))
        users.add(User("Ramiz Khan", "Ranchi Jharkhand"))
        users.add(User("Faiz Khan", "Ranchi Jharkhand"))
        users.add(User("Yashar Khan", "Ranchi Jharkhand"))

        //creating our adapter
        val adapter = CustomAdapter(users)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter
    }
    }

