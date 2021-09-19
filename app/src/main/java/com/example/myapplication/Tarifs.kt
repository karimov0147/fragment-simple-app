package com.example.myapplication

import java.io.Serializable

data class Tarifs(
    var name : String,
    var description : String,
    var image : String
) : Serializable