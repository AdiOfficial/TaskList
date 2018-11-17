package ws.tilda.anastasia.tasklist

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class ListSelectionRecyclerViewAdapter() : RecyclerView.Adapter<ListSelectionViewHolder>() {
    val listOfTitles = arrayOf("Shoppint List", "Chores", "Android Tutorials")

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ListSelectionViewHolder {
        val view = LayoutInflater.from(p0?.context).inflate(R.layout.list_selection_view_holder, p0, false)
        return ListSelectionViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listOfTitles.size
    }

    override fun onBindViewHolder(p0: ListSelectionViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}