package com.example.iq_test

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()
       var q1=QuestionData(
           "More than four-fifth of the natural elements are",
                   1,
                   "semi-solid",
                   "metal",
                   "liquid",
                   "solid",
       2
       )
       var q2=QuestionData(
           "The shiny appearance is found in a",
                 2,
                   "Metal",
                   "transparent",
                   "non-metal",
                   "solid",
           1
       )
       var q3=QuestionData(
           "Optic nerves carry impulses to the brain to help us in good",

                   3,
                           "waves",
                   "volume",
                   "vision",
                   "smell",
           3

       )
       var q4=QuestionData(
           "Without plants animals cannot",
                    4,
                   "survive",
                   "grow",
                   "develop",
                   "evolve",
       1
       )
       var q5=QuestionData(
           "The word 'psychology' comes from",
           5,
                   "Latin",
               "Spanish",
       "Greek",
       "Italian",
           3
       )
       var q6=QuestionData(
       "Which one of the following river flows between Vindhyan and Satpura ranges?",
           6,
           "Narmada",
                "Mahanadi",
                   "Son",
                   "Netravati",
           1

       )
       var q7=QuestionData(
           "The Central Rice Research Station is situated in?",
           7,
           "Chennai",
               "Cuttack",
               "Bangalore",
                   "Quilon",
           2
       )
       var q8=QuestionData(
           "The metal whose salts are sensitive to light is?",
               8,
           "Zinc",
                   "Silver",
                   "Copper",
                  "Aluminum",
           2
       )
       var q9=QuestionData(
            "River Luni originates near Pushkar and drains into which one of the following?",
                9,
           "Rann of Kachchh",
               "Arabian Sea",
               "Gulf of Cambay",
                  "Lake Sambhar" ,
                1


     )
       var q10=QuestionData(
           "The country that has the highest in Barley Production?",
           10,
           "China",
                "India",
                  "Russia",
                   "France",
           3

       )


       que.add(q1)
       que.add(q2)
       que.add(q3)
       que.add(q4)
       que.add(q5)
       que.add(q6)
       que.add(q7)
       que.add(q8)
       que.add(q9)
       que.add(q10)
       return que
   }
}