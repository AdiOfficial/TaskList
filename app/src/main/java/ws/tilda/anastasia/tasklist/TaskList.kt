package ws.tilda.anastasia.tasklist

import android.os.Parcel
import android.os.Parcelable

class TaskList(val name: String, val tasks: ArrayList<String> = ArrayList<String>()): Parcelable {

    /*
Adding secondary constructor. The TaskList object will be created from the passed in parcel. This word is used to pass
data read from the parcel to the primary constructor
*/
    constructor(source: Parcel) : this(source.readString(), source.createStringArrayList())

    override fun describeContents(): Int = 0

    // This function is used when creating parcelable from the TasList
    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(name)
        dest.writeStringList(tasks)
    }

    companion object CREATOR : Parcelable.Creator<TaskList> {
        override fun createFromParcel(parcel: Parcel): TaskList {
            return TaskList(parcel)
        }

        override fun newArray(size: Int): Array<TaskList?> {
            return arrayOfNulls(size)
        }
    }


}