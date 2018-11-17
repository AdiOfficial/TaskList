package ws.tilda.anastasia.tasklist

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class ListSelectionRecyclerViewAdapter(val lists: ArrayList<TaskList>) :
    RecyclerView.Adapter<ListSelectionViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ListSelectionViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.list_selection_view_holder, p0, false)
        return ListSelectionViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        if (holder != null) {
            holder.listPosition.text = (position + 1).toString()
            holder.listTitle.text = lists.get(position).name
        }
    }

    fun addList(list: TaskList) {
        lists.add(list)
        notifyDataSetChanged()
    }
}