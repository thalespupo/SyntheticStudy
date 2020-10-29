package com.thalespupo.syntheticstudy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.thalespupo.syntheticstudy.databinding.ListItemExampleBinding

class MyAdapter : ListAdapter<String, MyAdapter.MyViewHolder>(DiffCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item_example, parent, false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(getItem(position).orEmpty())
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val binding = ListItemExampleBinding.bind(itemView)

        fun bind(item: String) {
            binding.myTextView.text = item
        }

    }

    class DiffCallBack : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String) = false
        override fun areContentsTheSame(oldItem: String, newItem: String) = false
    }
}
