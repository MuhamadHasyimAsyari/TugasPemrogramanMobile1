package resepmakanan.resepmakanan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Resep> dataResep;
    private RecyclerView listResep;
    private ResepAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateData();
        listResep = (RecyclerView) findViewById(R.id.list_resep);

        adapter = new ResepAdapter(this, dataResep);
        listResep.setAdapter(adapter);
        listResep.setLayoutManager(new LinearLayoutManager(this));
    }

    private void generateData() {
        dataResep = new ArrayList<>();

        dataResep.add(new Resep("botok", "Sayur dengan rasa yang mantap, nendang",
                "<b>Bahan Dasar :</b><br>" +
                        "Tahu Ukuran sedang 5 biji <br>" +
                        "Tempe ukuran sedang 1 papan<br>" +
                        "Bawang putih sebanyak 3 pcs<br>" +
                        "Bawang merah sebanyak 4 pcs<br>" +
                        "Lengkuas sebanyak 1 pcs ukuran sedang<br>" +
                        "Cabe hijau secukupnya<br>" +
                        "10 buah cabe merah<br>" +
                        "Santan instan<br>" +
                        "Tomat 1 buah<br>" +
                        "Penyedap royco, garam dan gula pasir secukupnya<br>" +
                        "<b>Langkah Pembuatan :</b><br>" +
                        "1.Siapkan penggorengan dan beri minyak goreng secukupnya<br>" +
                        "2.Masukkan bawang putih, bawang merah dan irisan cabainya lalu aduk dan tumis<br>" +
                        "3.Tuang santan cairnya bersama dengan gula pasir, garam dapur dan penyedap royco secukupnya. Aduk aduk supaya semua bahan tercampur rata.<br>" +
                        "4.Masukkan lengkuas yang sudah dimemarkan bersama dengan daun salamnya. Aduk aduk lagi dan beri tambahan air sedikit supaya tidak terlalu kental kuahnya.<br>" +
                        "5.Aduk aduk sampai hampir mendidih kemudian masukkan potongan tempe dan tahunya<br>" +
                        "6.Aduk aduk sampai mendidih. Cek rasa terlebih dahulu dan tambahkan garam dan gula kalau diperlukan.<br>"
                , "Gambar"));

        dataResep.add(new Resep("gandul", "Masakan kekinian rasa tempo dulu",
                "<b>Bahan Dasar :</b><br>" +
                        "Bahan utama yang dibutuhkan adalah labu siam ukuran sedang besar dengan berat kurang lebih 200 gram.<br>" +
                        "Bawang putih kurang lebih sebanyak 2 pcs saja. Kupas kulitnya lalu iris iris tipis.<br>" +
                        "Bawang merah kurang lebih sebanyak 3 pcs saja. Kupas kulit bawang merahnya lalu iris iris tipis<br>" +
                        "Lengkuas yang sudah dimemarkan kurang lebih sepanjang 1 jari orang dewasa.<br>" +
                        "Daun salam kurang lebih sebanyak 3 pcs saja.<br>" +
                        "Gula merah kurang lebih sebanyak 1 sendok kecil saja.<br>" +
                        "Buah cabai merah dan cabai hijau secukupnya. Ccuci bersih lau iris serong.<br>" +
                        "Garam dapur dan gula pasir secukupnya sesuai selera.<br>" +
                        "Air bersih secukupnya atau kurang lebih sebanyak 0.1 liter saja.<br>" +
                        "Minyak goreng secukupnya untuk menumis bumbunya.<br>" +
                        "<br>" +
                        "<b>Langkah Pembuatan :</b><br>" +
                        "1.Langkah pertama belah menjadi 2 bagian lalu gesekan keduanya untuk menghilangkan getahnya kemudian baru dikupas, dicuci dan dipotong kecil kecil panjang.<br>" +
                        "2.Siapkan penggorengan dan beri minyak secukupnya<br>" +
                        "3.Masukkan irisan bawang merah, bawang putih, daun salam, lengkuas yang sudah dimemarkan dan irisan buah cabainya.<br>" +
                        "4.Tuangkan saus tiram untuk menambah rasa kangkuAduk aduk sampai tercium bau harum dan semua bahan tadi layu.ng<br>" +
                        "5.Tunggu hingga matang dan siap dinikmati"


                , "Gambar"));


    }
}
