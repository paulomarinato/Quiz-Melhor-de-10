package com.marinato.quizmelhorde10

import com.marinato.quizmelhorde10.model.Questions

class DataSource {
    companion object{

        fun createDataSource(id: Int, statement: String, options: String): ArrayList<Questions>{
            val list = ArrayList<Questions>()

            list.add(Questions(id: Int, statement: String, options: String))

            return list
        }
    }
}

