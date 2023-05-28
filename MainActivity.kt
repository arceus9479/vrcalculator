package com.vrsingh9479.calculator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.vrsingh9479.calculator.R
import java.lang.RuntimeException
import kotlin.math.cos
import kotlin.math.ln
import kotlin.math.log10
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.math.tan

class MainActivity : AppCompatActivity() {
    lateinit var primaryTV: TextView
    lateinit var secondaryTV: TextView
    lateinit var acBtn : Button
    lateinit var cBtn : Button
    lateinit var brace1Btn : Button
    lateinit var brace2Btn : Button
    lateinit var sinBtn : Button
    lateinit var cosBtn : Button
    lateinit var tanBtn : Button
    lateinit var logBtn : Button
    lateinit var lnBtn : Button
    lateinit var factBtn : Button
    lateinit var squareBtn : Button
    lateinit var sqRootBtn : Button
    lateinit var invBtn : Button
    lateinit var btn7 : Button
    lateinit var btn8 : Button
    lateinit var btn9 : Button
    lateinit var btn6 : Button
    lateinit var btn5 : Button
    lateinit var btn4 : Button
    lateinit var btn3 : Button
    lateinit var btn2 : Button
    lateinit var btn1 : Button
    lateinit var btn0 : Button
    lateinit var btnpie : Button
    lateinit var btnPoint : Button
    lateinit var btnMul : Button
    lateinit var btnSub : Button
    lateinit var btnAdd : Button
    lateinit var btnEqual : Button
    lateinit var btnDiv : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        primaryTV=findViewById(R.id.idTVPrimary)
        secondaryTV=findViewById(R.id.idTVSecondary)
        acBtn=findViewById(R.id.idBtnAC)
        cBtn=findViewById(R.id.idBtnC)
        brace1Btn=findViewById(R.id.idBtnBrac1)
        brace2Btn=findViewById(R.id.idBtnBrac2)
        sinBtn=findViewById(R.id.idBtnSin)
        cosBtn=findViewById(R.id.idBtnCos)
        tanBtn=findViewById(R.id.idBtnTan)
        logBtn=findViewById(R.id.idBtnLog)
        lnBtn=findViewById(R.id.idBtnln)
        factBtn=findViewById(R.id.idBtnfact)
        squareBtn=findViewById(R.id.idBtnSquare)
        sqRootBtn=findViewById(R.id.idBtnSqRoot)
        invBtn=findViewById(R.id.idBtnInv)
        btnDiv=findViewById(R.id.idBtnDiv)
        btnMul=findViewById(R.id.idBtnMul)
        btnSub=findViewById(R.id.idBtnSub)
        btnAdd=findViewById(R.id.idBtnAdd)
        btnEqual=findViewById(R.id.idBtnEqual)
        btnPoint=findViewById(R.id.idBtnpoint)
        btnpie=findViewById(R.id.idBtnPie)
        btn9=findViewById(R.id.idBtn9)
        btn8=findViewById(R.id.idBtn8)
        btn7=findViewById(R.id.idBtn7)
        btn6=findViewById(R.id.idBtn6)
        btn5=findViewById(R.id.idBtn5)
        btn4=findViewById(R.id.idBtn4)
        btn3=findViewById(R.id.idBtn3)
        btn2=findViewById(R.id.idBtn2)
        btn1=findViewById(R.id.idBtn1)
        btn0=findViewById(R.id.idBtn0)
        btn0.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"0")
        }
        btn1.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"1")
        }
        btn2.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"2")
        }
        btn3.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"3")
        }
        btn4.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"4")
        }
        btn5.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"5")
        }
        btn6.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"6")
        }
        btn7.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"7")
        }
        btn8.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"8")
        }
        btn9.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"9")
        }
        btnPoint.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+".")
        }
        btnAdd.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"+")
        }
        btnDiv.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"/")
        }
        brace1Btn.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"(")
        }
        brace2Btn.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+")")
        }
        btnpie.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"3.142")
            secondaryTV.text=(btnpie.text.toString())
        }
        sinBtn.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"sin")
        }
        cosBtn.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"cos")
        }
        tanBtn.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"tan")
        }
        invBtn.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"^"+"(-1)")
        }
        logBtn.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"log")
        }
        lnBtn.setOnClickListener{
            primaryTV.text=(primaryTV.text.toString()+"ln")
        }
        btnSub.setOnClickListener {
            val str: String = primaryTV.text.toString()
            if (!str.get(index = str.length - 1).equals("-")) {
                primaryTV.text = (primaryTV.text.toString() + "-")
            }
        }
            btnMul.setOnClickListener{
                val str:String=primaryTV.text.toString()
                if(!str.get(index=str.length-1).equals("*"))
                    primaryTV.text=(primaryTV.text.toString()+"*")
            }
            sqRootBtn.setOnClickListener{
                if(primaryTV.text.toString().isEmpty()){
                    Toast.makeText(this,"Please enter a valid number", Toast.LENGTH_SHORT).show()
                }
                else{
                    val str:String=primaryTV.text.toString()
                    val r= sqrt(str.toDouble())
                    val result=r.toString()
                    primaryTV.text=result
                }
            }
            cBtn.setOnClickListener{
                var str:String=primaryTV.text.toString()
                if(!str.equals("")){
                    str=str.substring(0,str.length-1)
                    primaryTV.text=str
                }
            }
            acBtn.setOnClickListener{
                primaryTV.text=""
                secondaryTV.text=""
            }
            squareBtn.setOnClickListener{
                if(primaryTV.text.toString().isEmpty()){
                    Toast.makeText(this,"Please enter a valid number",Toast.LENGTH_SHORT).show()
                }
                else{
                    val d: Double=primaryTV.text.toString().toDouble()
                    val square=d*d
                    primaryTV.text=square.toString()
                    secondaryTV.text=square.toString()
                }
            }
            factBtn.setOnClickListener{
                if(primaryTV.toString().isEmpty()){
                    Toast.makeText(this,"Please enter a valid number",Toast.LENGTH_SHORT).show()
                }
                else{
                    val value :Int=primaryTV.text.toString().toInt()
                    val fact: Int=factorial(value)
                    primaryTV.text=fact.toString()
                    secondaryTV.text=fact.toString()
                }
            }
            btnEqual.setOnClickListener{
                val str : String=primaryTV.text.toString()
                val result:Double =evaluate(str)
                val r=result.toString()
                primaryTV.text=r
                secondaryTV.text=str
            }
        }
    private fun factorial(n:Int):Int{
        return if(n==1|| n==0)1 else n*factorial(n-1)
    }
    private fun evaluate(str: String): Double {
        return object : Any() {
            var pos = -1
            var ch = 0
            fun nextChar() {
                ch = if (++pos < str.length) str[pos].code else -1
            }
            fun eat(charToEat: Int): Boolean {
                while (ch == ' '.code) nextChar()
                if (ch == charToEat) {
                    nextChar()
                    return true
                }
                return false
            }
            fun parse(): Double {
                nextChar()
                val x = parseExpression()
                if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
                return x
            }
            fun parseExpression(): Double {
                var x = parseTerm()
                while (true) {
                    if (eat('+'.code)) x += parseTerm()
                    else if (eat('-'.code)) x -= parseTerm()
                    else return x
                }
            }
            fun parseTerm(): Double {
                var x = parseFactor()
                while (true) {
                    if (eat('*'.code)) x *= parseFactor()
                    else if (eat('/'.code)) x /= parseFactor()
                    else return x
                }
            }
            fun parseFactor(): Double {
                if (eat('+'.code)) return parseFactor()
                if (eat('-'.code)) return -parseFactor()
                var x: Double
                val startPos = pos
                if (eat('('.code)) {
                    x = parseExpression()
                    eat(')'.code)
                } else if (ch >= '0'.code && ch <= '9'.code || ch == '.'.code) {
                    while (ch >= '0'.code && ch <= '9'.code || ch == '.'.code) nextChar()
                    x = str.substring(startPos, pos).toDouble()
                } else if (ch >= 'a'.code && ch <= 'z'.code) {
                    while (ch >= 'a'.code && ch <= 'z'.code) nextChar()
                    val func = str.substring(startPos, pos)
                    x = parseFactor()
                    x =
                        if (func == "sqrt") sqrt(x)
                        else if (func == "sin") sin(Math.toRadians(x))
                        else if (func == "cos") cos(Math.toRadians(x))
                        else if (func == "tan") tan(Math.toRadians(x))
                        else if (func == "log") log10(x)
                        else if (func == "ln") ln(x)
                        else throw RuntimeException("Unknown function: $func")
                } else {

                    throw RuntimeException("Unexpected: " + ch.toChar())
                }
                if (eat('^'.code)) x = x.pow(parseFactor())
                return x
            }
        }.parse()
    }
}