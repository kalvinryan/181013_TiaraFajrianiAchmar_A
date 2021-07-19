package com.example.a181013_tiarafajrianiachmar_a;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Locale;
public class MainActivity2 extends AppCompatActivity {

    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormater;
    private TextView tvDateResult;
    private EditText btnDatePicker;
    TextView txtTampil;
    EditText txtStb,txtNama,txtAlamat,txtTmpLahir;
    Button btnShow;
    RadioGroup jenisKelamin;
    CheckBox pilihan_1,pilihan_2,pilihan_3,pilihan_4,pilihan_5,pilihan_6;


    public void showDateDialog(){

        java.util.Calendar newCalender = java.util.Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                java.util.Calendar newDate = java.util.Calendar.getInstance();
                newDate.set(year,month,dayOfMonth);
                tvDateResult.setText(dateFormater.format((newDate.getTime())));
            }
        },newCalender.get(Calendar.YEAR),newCalender.get(Calendar.MONTH),newCalender.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        dateFormater = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        tvDateResult = (TextView) findViewById(R.id.txtTanggal);
        btnDatePicker=(EditText) findViewById(R.id.txtTanggal);
        txtTampil=(TextView) findViewById(R.id.txtTampil);
        btnShow=(Button)findViewById(R.id.btnShow);
        txtStb = findViewById(R.id.txtNim);
        txtNama = findViewById(R.id.txtNama);
        txtAlamat = findViewById(R.id.txtAlamat);
        txtTmpLahir = findViewById(R.id.txt_tempatLahir);
        jenisKelamin = findViewById(R.id.jk);
        pilihan_1=findViewById(R.id.chk_membaca);
        pilihan_2=findViewById(R.id.chk_games);
        pilihan_3=findViewById(R.id.chk_bersepeda);
        pilihan_4=findViewById(R.id.chk_kumpul);
        pilihan_5=findViewById(R.id.chck_gunung);
        pilihan_6=findViewById(R.id.chk_glow);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stb = txtStb.getText().toString();
                String nama = txtNama.getText().toString();
                String alamat = txtAlamat.getText().toString();
                String tlp = txtTmpLahir.getText().toString();
                String tmplahir = txtTmpLahir.getText().toString();
                String tglLahir = String.valueOf(tvDateResult.getText().toString());

                String baca,game,sepeda,kumpul,gunung,glowupp;


                int yourGender = jenisKelamin.getCheckedRadioButtonId();
                RadioButton jk =(RadioButton) findViewById(yourGender);
                String jkl=String.valueOf(jk.getText().toString());
                if(pilihan_1.isChecked()){
                    baca ="Membaca";
                }else
                    baca=null;

                if(pilihan_2.isChecked()){
                    game ="Main Games";
                }else
                    game=null;

                if(pilihan_3.isChecked()){
                    sepeda ="Besepeda";
                }else
                    sepeda=null;

                if(pilihan_4.isChecked()){
                    kumpul ="Berkumpul Dengan Teman";
                }else
                    kumpul=null;

                if(pilihan_5.isChecked()){
                    gunung ="Mendaki Gunung Kembar";
                }else
                    gunung=null;

                if(pilihan_1.isChecked()){
                    glowupp ="Berenang";
                }else
                    glowupp=null;

                String Biodata = "Data Dari "+stb+" "+nama+"\n"
                        +"NIM : " + stb+"\n"
                        +"Nama : " + nama+"\n"
                        +"Alamat : " + alamat+"\n"
                        +"Telephone : " + tlp+"\n"
                        +"Jenis kelamin : " + jkl+"\n"
                        +"Tempat Lahir : " + tmplahir+"\n"
                        +"Tanggal Lahir : " + tglLahir+"\n"
                        +"Hobby : " +"\n"
                        +"1. " +baca+"\n"
                        +"2. " +game+"\n"
                        +"3. " +sepeda+"\n"
                        +"4. " +kumpul+"\n"
                        +"5. " +gunung+"\n"
                        +"6. " +glowupp;
                txtTampil.setText(Biodata);
            }
        });
        dateFormater = new SimpleDateFormat("dd-MM-yyyy",Locale.US);
        tvDateResult=(TextView)findViewById(R.id.txtTanggal);
        btnDatePicker=(EditText) findViewById(R.id.txtTanggal);
        btnDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateDialog();
            }
        });
    }
}