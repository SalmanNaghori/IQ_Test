package com.example.iq_test

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    private var Name:String?=null
    private var score:Int=0
    private var currentPosition:Int=1
    private var questionList:ArrayList<QuestionData>?=null
    private  var selectedoption:Int=0
//    private var questionList:ArrayList<QuestionData>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        setData.getQuestion()

    Name=intent.getStringExtra(setData.name)

    questionList=setData.getQuestion()
    setQuestion()
    o_tv1.setOnClickListener {
        selectedOptionStyle(o_tv1,1)
    }
    o_tv2.setOnClickListener {
        selectedOptionStyle(o_tv2,2)
    }
    o_tv3.setOnClickListener {
        selectedOptionStyle(o_tv3,3)
    }
     o_tv4.setOnClickListener {
        selectedOptionStyle(o_tv4,4)
    }

    o_btn.setOnClickListener {
        if(selectedoption!=0) {
            val question = questionList!![currentPosition - 1]
            if (selectedoption != question.correct_ans) {
                setColor(selectedoption, R.drawable.wrong)
            }else{
                score++;
            }
            setColor(question.correct_ans, R.drawable.correct)
            if (currentPosition == questionList!!.size) {
                o_btn.text = "finsh"
            } else {
                o_btn.text = "Go to Next"
            }
        }
        else{
                currentPosition++
            when{
                currentPosition<=questionList!!.size->{
                    setQuestion()
                }
                else-> {
                    var intent:Intent=Intent(this,result::class.java)
                    intent.putExtra(setData.name,Name.toString())
                    intent.putExtra(setData.score,score.toString())
                    intent.putExtra("Total size",questionList!!.size.toString())
                    startActivity(intent)
                    finish()
                }
            }

        }
        selectedoption=0
        }
    }






   fun setColor(opt:Int,color:Int) {
       when(opt){
           1->{
               o_tv1.background=ContextCompat.getDrawable(this,color)
           }
           2->{
               o_tv2.background=ContextCompat.getDrawable(this,color)
           }
           3->{
               o_tv3.background=ContextCompat.getDrawable(this,color)
           }
           4->{
               o_tv4.background=ContextCompat.getDrawable(this,color)
           }
       }

    }

    fun setQuestion() {
        setOptionStyle()


        val question=questionList!![currentPosition-1]
        q_prog1.progress=currentPosition
        q_prog1.max=questionList!!.size
        q_tv2.text="${currentPosition}"+"/"+"${questionList!!.size}"
        q_tv1.text=question.question
        o_tv1.text=question.option_one
        o_tv2.text=question.option_two
        o_tv3.text=question.option_three
        o_tv4.text=question.option_four

    }
    fun setOptionStyle()
    {
        var optionList:ArrayList<TextView> = arrayListOf()
        optionList.add(0,o_tv1)
        optionList.add(1,o_tv2)
        optionList.add(2,o_tv3)
        optionList.add(3,o_tv4)

        for(op in optionList)
        {
            op.setTextColor(Color.parseColor("#555151"))
            op.background=ContextCompat.getDrawable(this,R.drawable.question_option)
            op.typeface= Typeface.DEFAULT
        }



    }
    fun selectedOptionStyle(view:TextView,opt:Int)
    {
        setOptionStyle()
        selectedoption=opt
        view.background=ContextCompat.getDrawable(this,R.drawable.selected_question_option)
        view.typeface= Typeface.DEFAULT_BOLD
        view.setTextColor(Color.parseColor("#000000"))

    }
}