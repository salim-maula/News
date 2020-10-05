package com.example.jawapos3.NewsAdapter

import com.example.jawapos3.R

data class news(var title:String, var desc:String, var photo: Int)

object NewsModel {
    val newslists = listOf<news>(
        news("Game Among Us Dongkrak Unduhan Discord",
            "11 Agustus 2020 12:40",
            R.drawable.img_1),
        news("Kondisi Trump Mengkhawatirkan? Rupiah Dalam Bahaya Nih",
            "04 October 2020 13:00",
            R.drawable.img_2),
        news("5 Fakta Unik Jelang MU vs Tottenham Hotspur",
            " 04 October 2020 13:20 ",
            R.drawable.img_3),
        news("Wagub Tepis Isu 'Anies Dilarikan ke RS Royal Sunter': Kondisinya Sehat",
            "04 October 2020 13:35",
            R.drawable.img_4),
        news("Aduh! Anak-anak Ini Berkumpul dan Abaikan Protokol Kesehatan",
            "04 October 2020 13:40",
            R.drawable.img_5),
        news("Batal Comeback, Kento Momota Absen di Denmark Open 2020",
            "04 October 2020 14:20",
            R.drawable.img_6),
        news("Bengkel di Setiabudi Jaksel Terbakar, 7 Mobil Damkar Dikerahkan",
            "04 October 2020 14:40",
            R.drawable.img_7),
        news("Aksi Elbow Down Marquez Bakal Diadopsi Pebalap Muda MotoGP?",
            "04 October 2020 14:55",
            R.drawable.img_8),
        news("Dulu Korban PHK, Kini Jacky Sukses Jadi Pengusaha Klappertaart",
            "04 October 2020 15:40",
            R.drawable.img_9),

        )
}