package com.example.kakaologin.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class LoginDTO {
    @SerializedName("token")
    @Expose
    var token : String = ""

}