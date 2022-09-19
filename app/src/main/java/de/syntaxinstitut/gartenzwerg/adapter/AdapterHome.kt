package de.syntaxinstitut.gartenzwerg.adapter

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Context
import android.os.Handler
import android.os.HandlerThread
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import de.syntaxinstitut.gartenzwerg.R
import de.syntaxinstitut.gartenzwerg.data.models.Pflanzen
import de.syntaxinstitut.gartenzwerg.databinding.FragmentHomeBinding
import de.syntaxinstitut.gartenzwerg.databinding.ListItemBinding
import de.syntaxinstitut.gartenzwerg.ui.home.HomeFragmentDirections

class AdapterHome(
    private val dataset: List<Pflanzen>,
    private val context: Context

) : RecyclerView.Adapter<AdapterHome.ItemViewHolder>() {

    class ItemViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]


        val animator = ObjectAnimator.ofFloat(holder.binding.cvListItem, View.SCALE_Y, 0f, 1f)
        animator.duration = 800
        animator.start()

        holder.binding.cvListItem.setOnClickListener {
            clickAnimation(it as CardView, item.clicked)
            item.clicked = !item.clicked
            Handler().postDelayed({
                holder.itemView.findNavController().navigate(
                    HomeFragmentDirections.actionHomeFragmentToDetailFragment(
                        name = item.name,
                        bild = item.pictureResource,
                        text = item.text,
                        id = position + 1,
                        aussaatStart = item.aussaatZeitStart,
                        aussaatEnde = item.aussaatZeitEnde,
                        ernteStart = item.ernteZeitStart,
                        ernteEnde = item.ernteZeitEnde,
                        pflanzenProQm = item.pflanzenProQMeter
                    )
                )
            },730)

        }
        holder.binding.ivListItem.setImageResource(item.pictureResource)
        holder.binding.tvListItem.text = item.name
    }

    private fun clickAnimation(cardView: CardView, clicked: Boolean) {
        val rotator = ObjectAnimator.ofFloat(cardView, View.ROTATION_Y, 0f, 360f)
        rotator.duration = 700

        val set = AnimatorSet()
        set.playTogether(rotator)
        set.start()
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}