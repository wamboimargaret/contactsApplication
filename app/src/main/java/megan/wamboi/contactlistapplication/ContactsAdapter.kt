package megan.wamboi.contactlistapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation
import megan.wamboi.contactlistapplication.databinding.ContactListItemBinding

class ContactAdapter (var ContactList:List<ContactData>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding =
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=ContactList.get(position)
        var binding = holder.binding
//        binding.ivAvatar.text=currentContact.avatar
        binding.tvDisplayName.text=currentContact.dislayName
        binding.tvPhoneNumber.text=currentContact.phoneNumber
        binding.tvEmail.text=currentContact.emailAddress
        Picasso
            .get()
            .load(currentContact.avatar)
//            .resize(80,80)
//            .centerCrop()
            .transform(CropCircleTransformation())
            .placeholder(R.drawable.wamboimegan)
            .error(R.drawable.wamboimegan)
            .into(binding.ivAvatar)

    }

    override fun getItemCount(): Int {
        return ContactList.size

    }
}
class ContactViewHolder(var binding: ContactListItemBinding):ViewHolder(binding.root)