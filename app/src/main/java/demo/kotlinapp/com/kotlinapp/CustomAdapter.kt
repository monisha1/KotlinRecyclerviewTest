package demo.kotlinapp.com.kotlinapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import java.util.zip.Inflater

/**
 * Created by Saad on 10/21/2017.
 */
class CustomAdapter(val userList : ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun bindItems(user :User){
            val textviewName = itemView.findViewById(R.id.textViewUsername) as TextView
            val textviewAddress =  itemView.findViewById(R.id.textViewAddress) as TextView
            textviewName.text = user.name
            textviewAddress.text = user.address
        }

    }

   /* //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: User) {
            val textViewName = itemView.findViewById(R.id.textViewUsername) as TextView
            val textViewAddress  = itemView.findViewById(R.id.textViewAddress) as TextView
            textViewName.text = user.name
            textViewAddress.text = user.address
        }
    }*/

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder?, position: Int) {
        holder?.bindItems(userList[position])
    }


    override fun getItemCount(): Int {
      return  userList.size
    }

}