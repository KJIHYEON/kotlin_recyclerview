package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList = arrayListOf(
            Profiles(R.drawable.woman, "김선호",20,"개발팀"),
            Profiles(R.drawable.man, "김성민",20,"개발팀"),
            Profiles(R.drawable.woman, "김땡땡",20,"개발팀"),
            Profiles(R.drawable.man, "이개똥",20,"개발팀"),
            Profiles(R.drawable.woman, "박길동",20,"디자인팀"),
            Profiles(R.drawable.man, "임개똥",20,"기획팀"),
            Profiles(R.drawable.man, "정개똥",20,"기획팀"),
            Profiles(R.drawable.woman, "김두부",20,"디자인팀"),
            Profiles(R.drawable.man, "정수",20,"개발팀"),
            Profiles(R.drawable.man, "김김김",20,"개발팀")


            )

        rv_profile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_profile.setHasFixedSize(true)
        rv_profile.adapter = ProfileAdapter(profileList)

    }
}