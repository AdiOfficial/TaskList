package ws.tilda.anastasia.tasklist

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

class ListSelectionRecyclerViewAdapter(): RecyclerView.Adapter<ListSelectionViewHolder>() {
   val listOfTitles = arrayOf("Shoppint List", "Chores", "Android Tutorials")

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ListSelectionViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return listOfTitles.size
    }

    override fun onBindViewHolder(p0: ListSelectionViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}