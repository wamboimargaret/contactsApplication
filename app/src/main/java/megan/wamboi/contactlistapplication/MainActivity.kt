package megan.wamboi.contactlistapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import megan.wamboi.contactlistapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
//        versionCode 1

    override fun onResume() {
        super.onResume()
        displayContact()
    }
    fun displayContact(){
        val contact1=ContactData("@drawable/wamboimegan.jpg","Onesmus Maina","0791653445","onmaina@gmail.com")
        val contact2=ContactData("HE","Henry ","0706553445","henry@gmail.com")
        val contact3=ContactData("HE","joy Njeri","0711153445","joy@gmail.com")
        val contact4=ContactData("HE","Megan Wamboi","0734553445","meg@gmail.com")
        val contact5=ContactData("HE","Pato wa mboga","07890153445","pato@gmail.com")
        val contact6=ContactData("HE","Njoro wa Uba","0711153445","njoro@gmail.com")
        val contact7=ContactData("HE","Joe Njagi","0718953445","joe@gmail.com")
        val contact8=ContactData("HE","Mama Mboga","0778153445","mamamboga@gmail.com")
        val contact9=ContactData("HE","Winnie Wamboi","0711153445","wamboi@gmail.com")

        val contactList = listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9)
        val ContactAdapter=ContactAdapter(contactList)
        binding.rvcontacts.layoutManager=LinearLayoutManager(this)
        binding.rvcontacts.adapter=ContactAdapter
    }

}
