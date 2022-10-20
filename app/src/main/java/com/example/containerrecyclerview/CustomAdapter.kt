package com.example.containerrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.containerrecyclerview.databinding.ItemRecyclerBinding
import java.text.SimpleDateFormat

class CustomAdapter : RecyclerView.Adapter<Holder>() {
	var listData = mutableListOf<Memo>()
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
		// 아이템 레이아웃을 생성하는 메소드(한 화면에 보이는 개수만큼 안드로이드가 이 메소드를 호출한다.)
		val binding = ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
		return Holder(binding)
	}

	override fun onBindViewHolder(holder: Holder, position: Int) {
		// 생성된 뷰홀더를 화면에 보여줌
		val memo = listData.get(position)
		holder.setMemo(memo)
	}

	override fun getItemCount(): Int {
		// 데이터의 촐 개수를 리턴
		return  listData.size
	}
}
class Holder(val binding: ItemRecyclerBiding) : RecyclerView.ViewHolder(binding.root){
	init {
		binding.root.setOnClickListener{
			Toast.makeText(binding.root.context
				, "클릭된 아이템 = ${binding.txtTitle.text}"
				,Toast.LENGTH_LONG).show()
		}
	}
	fun setMemo(momo: Memo){
		binding.txtNo.text
		binding.txtTitle.text = memo.title
		var sdf = SimpleDateFormat("yyyy/MM/dd")
		var formatteDate = sdf.format(memo.timestamp)
		binding.
	}
}