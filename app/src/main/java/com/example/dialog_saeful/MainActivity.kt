package com.example.dialog_saeful

import android.annotation.SuppressLint
import android.app.Activity
import android.app.ProgressDialog.show
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profil = findViewById<Button>(R.id.bu)
        val input = findViewById<Button>(R.id.buk)


        profil.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Data Diri")
                .setMessage(
                    "Nama : M Saefulloh Arahman" +
                            "Kelas : XI PPLG 1" +
                            "Nis : 2233266"
                )
                .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "Tombol Yes Ditekan", Toast.LENGTH_LONG).show()
                })
                .setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "Tombol No Ditekan", Toast.LENGTH_LONG).show()
                })
                .show()
        }
        input.setOnClickListener {
            val inflater = layoutInflater
            val dialoglayout = inflater.inflate(R.layout.activity_main2, null)
            val editText = dialoglayout.findViewById<EditText>(R.id.editText)
            AlertDialog.Builder(this)
                .setTitle("Masukkan Nama Lengkap")
                .setView(dialoglayout)
                .setPositiveButton("Lanjut",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "Nama Kamu adalah"+ editText.getText().toString(), Toast.LENGTH_SHORT)
                        .show()
                })
                .setNegativeButton("Batal",
            DialogInterface.OnClickListener { dialogInterface, i ->

            }).show()
        }
    }
}