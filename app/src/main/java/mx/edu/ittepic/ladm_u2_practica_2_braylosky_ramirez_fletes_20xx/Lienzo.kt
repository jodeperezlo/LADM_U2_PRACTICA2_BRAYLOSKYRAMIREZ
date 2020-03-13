package mx.edu.ittepic.ladm_u2_practica_2_braylosky_ramirez_fletes_20xx

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(p:MainActivity) : View(p) {


    var cirPeque1 = Constructor(100,240,40)
    var cirPeque2 = Constructor(900,1200,60)
    var cirPeque3 = Constructor(500,10,20)

    var cirGi1 = Constructor(1000,200,100)
    var cirGi2 = Constructor(40,1000,200)
    var cirGi3 = Constructor(300,600,150)


    var punteroConstructor: Constructor? = null

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.BLACK)
        //Pasto Rectangulo
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        cirPeque1.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 5f
        cirPeque1.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.RED
        cirPeque2.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 5f
        cirPeque2.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.YELLOW
        cirPeque3.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 5f
        cirPeque3.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.BLACK
        cirGi1.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 5f
        cirGi1.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.BLUE
        cirGi2.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 5f
        cirGi2.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        cirGi3.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 5f
        cirGi3.pintar(canvas, paint)


    }



    fun animacion() {
        cirPeque1.rebote1(width,height)
        cirPeque2.rebote1(width,height)
        cirPeque3.rebote1(width,height)

        invalidate()
    }

    fun animacion2() {
        cirGi1.rebote2(width,height)
        cirGi2.rebote2(width,height)
        cirGi3.rebote2(width,height)
        invalidate()
    }
}