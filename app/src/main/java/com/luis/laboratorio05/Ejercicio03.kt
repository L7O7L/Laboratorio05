package com.luis.laboratorio05

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ejercicio03.*

class Ejercicio03 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio03)
        saveMusic()
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    fun saveMusic() {

        btnSave.setOnClickListener {

            var image = edtImage.text
            var uriImage = "@drawable/$image"
            var imageId = resources.getIdentifier(uriImage, null, getPackageName())

            var nameSong = edtTitle.text
            var nameBand = edtNameBand.text
            var timeSong = edtTime.text



            if (cvMusic1.visibility == View.GONE){

                imvMusic1.setImageDrawable(resources.getDrawable(imageId))
                tvNameSong1.text = nameSong
                tvNameBand1.text = nameBand
                tvTimeSong1.text = timeSong
                cvMusic1.visibility = View.VISIBLE

                edtTime.setText("")
                edtImage.setText("")
                edtTitle.setText("")
                edtNameBand.setText("")

            }else if (cvMusic1.visibility == View.VISIBLE) {

                if (cvMusic2.visibility == View.GONE){

                    imvMusic2.setImageDrawable(resources.getDrawable(imageId))
                    tvNameSong2.text = nameSong
                    tvNameBand2.text = nameBand
                    tvTimeSong2.text = timeSong

                    cvMusic2.visibility = View.VISIBLE

                    edtTime.setText("")
                    edtImage.setText("")
                    edtTitle.setText("")
                    edtNameBand.setText("")

                }else if (cvMusic2.visibility == View.VISIBLE){

                    if(cvMusic3.visibility == View.GONE){

                        imvMusic3.setImageDrawable(resources.getDrawable(imageId))
                        tvNameSong3.text = nameSong
                        tvNameBand3.text = nameBand
                        tvTimeSong3.text = timeSong

                        cvMusic3.visibility = View.VISIBLE

                        edtTime.setText("")
                        edtImage.setText("")
                        edtTitle.setText("")
                        edtNameBand.setText("")

                    }else if (cvMusic3.visibility == View.VISIBLE){

                        if (cvMusic4.visibility == View.GONE){

                            imvMusic4.setImageDrawable(resources.getDrawable(imageId))
                            tvNameSong4.text = nameSong
                            tvNameBand4.text = nameBand
                            tvTimeSong4.text = timeSong

                            cvMusic4.visibility = View.VISIBLE

                            edtTime.setText("")
                            edtImage.setText("")
                            edtTitle.setText("")
                            edtNameBand.setText("")

                        }else if(cvMusic4.visibility == View.VISIBLE){

                            if (cvMusic5.visibility == View.GONE){

                                imvMusic5.setImageDrawable(resources.getDrawable(imageId))
                                tvNameSong5.text = nameSong
                                tvNameBand5.text = nameBand
                                tvTimeSong5.text = timeSong

                                cvMusic5.visibility = View.VISIBLE

                                edtTime.setText("")
                                edtImage.setText("")
                                edtTitle.setText("")
                                edtNameBand.setText("")

                            }else if (cvMusic5.visibility == View.VISIBLE){

                                if (cvMusic6.visibility == View.GONE){

                                    imvMusic6.setImageDrawable(resources.getDrawable(imageId))
                                    tvNameSong6.text = nameSong
                                    tvNameBand6.text = nameBand
                                    tvTimeSong6.text = timeSong

                                    cvMusic6.visibility = View.VISIBLE

                                    edtTime.setText("")
                                    edtImage.setText("")
                                    edtTitle.setText("")
                                    edtNameBand.setText("")

                                }else if (cvMusic6.visibility == View.VISIBLE){

                                    Toast.makeText(this, "Maximo 6 canciones", Toast.LENGTH_SHORT).show()

                                }

                            }

                        }

                    }

                }

            }

        }

    }

}