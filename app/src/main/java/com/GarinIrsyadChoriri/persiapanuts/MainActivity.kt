package com.example.persiapanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.smp3,"SEKOLAH DI TEGAL","SMPN 3 Tegal","SMPN 3 TEGAL.\n Jl. Yos Sudarso, Tegalsari, Kec. Tegal Barat, Kota Tegal Prov. Jawa Tengah "))

        data?.add(DataModel(R.drawable.sma1,"SEKOLAH DI TEGAL","SMAN 1 Tegal","SMAN 1 Tegal.\n Jl. Menteri Supeno, Kejambon, Kec. Tegal Tim., Kota Tegal, Jawa Tengah 52125"))
        data?.add(DataModel(R.drawable.smp5,"SEKOLAH DI TEGAL","SMPN 5 Tegal","SMPN 5 Tegal.\n  Jl. Gatot Subroto No.1, Debong Kulon, Kec. Tegal Sel., Kota Tegal, Jawa Tengah 52133 "))
        data?.add(DataModel(R.drawable.sma4,"SEKOLAH DI TEGAL","SMAN 4 Tegal","SMAN 4 Tegal.\n Jl. Dr. Setiabudi No.32, RT.09/RW.04, Panggung, Kec. Tegal Tim., Kota Tegal, Jawa Tengah 52122 "))
        data?.add(DataModel(R.drawable.sma2,"SEKOLAH DI TEGAL","SMAN 2 Tegal","SMAN 2 Tegal.\n Jl. Lumba Lumba No.24, Tegalsari, Kec. Tegal Bar., Kota Tegal, Jawa Tengah 52111 "))

        data?.add(DataModel(R.drawable.smp2,"SEKOLAH DI TEGAL","SMPN 2 Tegal","SMPN 2 Tegal.\n  Jl. Projosumarto I No. 59 Wangandawa, Wangandawa, Kec. Talang, Kab. Tegal Prov. Jawa Tengah "))
        data?.add(DataModel(R.drawable.sma3,"SEKOLAH DI TEGAL","SMAN 3 Tegal","SMAN 3 Tegal.\n Jl. Sumbodro No.81, Slerok, Kec. Tegal Tim., Kota Tegal, Jawa Tengah 52125"))
        data?.add(DataModel(R.drawable.smp4,"SEKOLAH DI TEGAL","SMPN 4  Tegal","SMPN 4  Tegal.\n Jalan Doktor Setiabudi No.163 A, Panggung, Tegal Timur, Tegal City, Central Java 52122 "))
        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.lokasi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}