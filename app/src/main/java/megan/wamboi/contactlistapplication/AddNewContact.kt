package megan.wamboi.contactlistapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import megan.wamboi.contactlistapplication.databinding.ActivityAddNewContactBinding

class AddNewContact : AppCompatActivity() {
    lateinit var binding:ActivityAddNewContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAddNewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnaddperson.setOnClickListener {
            validateAdd()
            clearError()
        }
    }

    fun validateAdd(){
        val name = binding.etname.text.toString()
        val phone = binding.etphonenumber.text.toString()
        val email = binding.etemail.text.toString()
        var error = false

        if (name.isBlank()){
            binding.tilname.error = "Enter name"
            error = true
        }
        if (phone.isBlank()){
            binding.tilphonenumber.error = "Enter Phone number"
            error = true
        }

        if (email.isBlank()){
            binding.tilemail.error = "Enter email adress"
            error = true
        }

        if(!error){
            Toast.makeText(this,"Contact added successfully", Toast.LENGTH_LONG)
                .show()
        }

    }

    fun clearError(){
        binding.tilname.error = null
        binding.tilphonenumber.error = null
        binding.tilemail.error = null
    }
}