package com.example.almebartar.model

import kotlinx.serialization.Serializable

@Serializable
data class note(
    val id:Int,
    val title:String,
    val body:String
    )
