package ws.tilda.anastasia.tasklist

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class ListItemsRecyclerViewAdapter(var list: TaskList) : RecyclerView.Adapter<ListItemViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ListItemViewHolder {
        val view = LayoutInflater.from(p0?.context).inflate(R.layout.task_view_holder, p0, false)
        return ListItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.tasks.size
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.taskTextView.text = list.tasks.get(position)

    }
}