package mx.edu.ittepic.ladm_u2_practica_2_braylosky_ramirez_fletes_20xx

class Hilo (p:MainActivity):Thread(){
    var puntero = p

    override fun run() {
        super.run()

        while(true){
            sleep(100)
            puntero.runOnUiThread {
                puntero.lienzo!!.animacion()
                puntero.lienzo!!.animacion2()
            }
        }
    }
}