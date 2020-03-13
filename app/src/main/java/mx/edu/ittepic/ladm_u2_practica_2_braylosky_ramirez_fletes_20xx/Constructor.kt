package mx.edu.ittepic.ladm_u2_practica_2_braylosky_ramirez_fletes_20xx

import android.graphics.Canvas
import android.graphics.Paint

class Constructor (){
    var x = 0f
    var y = 0f

    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var incY = 5
    var incX= 5

    var incY2 = 20
    var incX2= 20

    constructor(x:Int, y:Int, radio:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
    }


    fun pintar(c: Canvas, p: Paint){
        c.drawCircle(x,y,radio,p)

    }
    fun rebote1(ancho:Int, alto:Int){
        x+= incX
        if(x<=-100 || x>=ancho){
            incX *= -1
        }
        y+= incY
        if(y<=-100 || y>=alto){
            incY *= -1
        }

    }

    fun rebote2(ancho:Int, alto:Int){
        x+= incX2
        if(x<=-100 || x>=ancho){
            incX2 *= -1
        }
        y+= incY2
        if(y<=-100 || y>=alto){
            incY2 *= -1
        }

    }

}