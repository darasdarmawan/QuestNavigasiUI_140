package com.example.praktikum5.view

import android.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick: ()-> Unit
){
    val item = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), "Contoh Nama"),
        Pair(stringResource(id = R.string.jenis_kelamin), "Lainnya"),
        Pair(stringResource(id = "ALAMAT"), "Yogyakarta")
    )
    Scaffold (modifier = Modifier,
        {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.tampil),
                        color = Color.White
                    )},
                colors = TopAppBarDefaults
                    .mediumTopAppBarColors(colorResource
                        (id = R.color.teal_700)
                    )
            )
        }) { isiRuang->
        Column (
            modifier = Modifier.padding(isiRuang),
        )

    }
}

