package ir.dunijet.wikipedia.adapter

import ir.dunijet.wikipedia.data.ItemPost

interface ItemEvents {

    fun onItemClicked( itemPost: ItemPost )

}