package com.example.clickon

import android.provider.Telephony.Mms.Rate

data class MoreAssistances(
    val id: Int,
    val bannerUrl: String,
    val text: String,
    val rate: Double,
    val category: String,
    val distance: Double,
    val time: String,
    val price: Double

)