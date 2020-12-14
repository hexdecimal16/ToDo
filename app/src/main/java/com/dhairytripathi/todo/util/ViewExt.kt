package com.dhairytripathi.todo.util

import androidx.appcompat.widget.SearchView


inline fun SearchView.onQueryTextChanged(crossinline listener: (String) ->  Unit )  {
    this.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
        override fun onQueryTextChange(query: String?): Boolean {
            listener(query.orEmpty())
            return true
        }

        override fun onQueryTextSubmit(query: String?): Boolean {
            return true
        }
    })
}