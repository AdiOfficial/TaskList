package ws.tilda.anastasia.tasklist

import android.content.Context
import android.preference.PreferenceManager

class ListDataManager(val context: Context) {

    fun saveList(list: TaskList) {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
            .edit()// we call edit() because we will need to edit the sh.p.
        sharedPreferences.putStringSet(
            list.name,
            list.tasks.toHashSet()
        ) //putting the array list as set to the shared preferences
        sharedPreferences.apply() //saved the list
    }

    fun readLists(): ArrayList<TaskList> {
        val sharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(context) //we just need to read, so not calling edit()
        val sharedPreferencesContent = sharedPreferences.all // need to get the contents of sh.p.
        val taskLists = ArrayList<TaskList>()
        //Looping through the sh.p.contents
        for (preferenceItem in sharedPreferencesContent) {
            val itemHashSet =
                preferenceItem.value as HashSet<String> //we get the value of each item and cast it to HashSet
            val list = TaskList(preferenceItem.key, ArrayList(itemHashSet)) // from the set we make the list
            taskLists.add(list) //add a list to the task lists
        }
        return taskLists
    }
}