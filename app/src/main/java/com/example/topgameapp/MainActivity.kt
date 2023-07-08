package com.example.topgameapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView:RecyclerView=findViewById(R.id.recyclerview)
        recyclerView.layoutManager= LinearLayoutManager(this,

        LinearLayoutManager.VERTICAL,
            false

        )
        var gameList: ArrayList<GameModel> = ArrayList()


        val g1 =GameModel(R.drawable.card1,"Horizon Chase",)
        val g2 =GameModel(R.drawable.card2,"PUBG",)
        val g3 =GameModel(R.drawable.card3,"Head Ball 2",)
        val g4 =GameModel(R.drawable.card4,"FIFA 2022",)
        val g5 =GameModel(R.drawable.card5,"Fortnite",)
        val g6 =GameModel(R.drawable.card6,"Hooked on You",)

        gameList.add(g1)
        gameList.add(g2)
        gameList.add(g3)
        gameList.add(g4)
        gameList.add(g5)
        gameList.add(g6)

        val adapter=GameAdapter(gameList)
        recyclerView.adapter=adapter
    }
}