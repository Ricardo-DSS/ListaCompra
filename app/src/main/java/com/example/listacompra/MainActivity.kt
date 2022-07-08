package com.example.listacompra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt_produto = findViewById<EditText>(R.id.txt_produto)
        val btn_inserir = findViewById<Button>(R.id.btn_inserir)
        val list_view_produtos = findViewById<ListView>(R.id.list_view_produtos)

        //implementação do adaptador de lista
        val produtosAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

        //Agora faz-se a ligação do adaptador no list_view que será exposto
        list_view_produtos.adapter = produtosAdapter

        btn_inserir.setOnClickListener{
            val produto = txt_produto.text.toString()
            produtosAdapter.add(produto)
        }
    }
}