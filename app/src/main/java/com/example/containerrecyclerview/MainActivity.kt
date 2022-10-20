package com.example.containerrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.containerrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		val data: MutableList<Memo> = loadData()
		var adapter = CustomAdapter()
		adapter.listData = data
		binding.recyclerView.adapter = adapter

		binding.recyclerView.layoutManager = LinearLayoutManager(this)
	}

	fun loadData() : MutableList<Memo> {
		val data : MutableList<Memo> = mutableListOf()
		// Memo 클래스의 인스턴스만 저장하는 data라는 리스트 생성(크기는 0)
		for(no in 1..100){
			var title = "코틀린 ${no}"
			val date = System.currentTimeMillis()
			val memo = Memo(no, title, date)		// data리스트에 저장할 MEmo인스턴스 생성
			data.add(memo)
		}
		return data
	}
}
