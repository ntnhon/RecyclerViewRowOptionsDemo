package info.nguyenthanhnhon.rowoptionsdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import info.nguyenthanhnhon.rowoptionsdemo.databinding.TextViewHolderBinding

class TextViewHolder(private val binding: TextViewHolderBinding) : RecyclerView.ViewHolder(binding.root) {
    companion object {
        fun from(parent: ViewGroup): TextViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = TextViewHolderBinding.inflate(inflater, parent, false)
            return TextViewHolder(binding)
        }
    }

    fun bind(text: String) {
        binding.textView.text = text
    }
}