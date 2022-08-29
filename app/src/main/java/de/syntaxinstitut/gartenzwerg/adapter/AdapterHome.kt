package de.syntaxinstitut.gartenzwerg.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import de.syntaxinstitut.gartenzwerg.data.models.Pflanzen
import de.syntaxinstitut.gartenzwerg.databinding.ListItemBinding

class AdapterHome (
    private val dataset: List<Pflanzen>

        ) : RecyclerView.Adapter<AdapterHome.ItemViewHolder>(){

            class ItemViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]

        holder.binding.ivListItem.setImageResource(item.pictureResource)
        holder.binding.tvListItem.text = item.name
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

        }