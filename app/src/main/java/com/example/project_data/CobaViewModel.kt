package com.example.project_data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel(){
    var  namaUsr : String by mutableStateOf("")
        private set
    var noTlp : String by mutableStateOf("")
        private set
    var jenisKl : String by mutableStateOf("")
        private set
    var email : String by mutableStateOf("")
        private set
    var alamat : String by mutableStateOf("")
        private set
    var status : String by mutableStateOf("")
        private set

    private val _uiState = MutableStateFlow(DataForm())
    val uiState : StateFlow<DataForm> = _uiState.asStateFlow()

    fun insertData(nm: String, tlp: String, jk: String, mail: String, alt: String, st: String){
        namaUsr = nm;
        noTlp = tlp;
        jenisKl = jk;
        email = mail;
        alamat = alt;
        status = st;

    }

    fun setJenisK(pilihjk: String){
        _uiState.update { currentState -> currentState.copy(sex = pilihjk) }
    }
    fun setStatus(pilihst: String){
        _uiState.update { currentState -> currentState.copy(status = pilihst) }
    }

}