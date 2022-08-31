package de.syntaxinstitut.gartenzwerg.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import de.syntaxinstitut.gartenzwerg.data.models.Pflanzen
import de.syntaxinstitut.gartenzwerg.databinding.FragmentHomeBinding
import de.syntaxinstitut.gartenzwerg.databinding.ListItemBinding
import de.syntaxinstitut.gartenzwerg.ui.home.HomeFragmentDirections

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
        holder.binding.cvListItem.setOnClickListener{
            holder.itemView.findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment(name = item.name, bild = item.pictureResource, text = item.text, id = position+1))
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

        }