package com.example.historyappnew1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Infomation = findViewById<TextView>(R.id.Infomation)
        val EnterAge = findViewById<EditText>(R.id.EnterAge)
        val ClearBtn = findViewById<Button>(R.id.ClearBtn)
        val historyBtn = findViewById<Button>(R.id.HistoryBtn)
        val textView2 = findViewById<TextView>(R.id.textView2)
        ClearBtn.setOnClickListener { EnterAge.text.clear() }

        historyBtn.setOnClickListener {
            val EnterAge = EnterAge.text.toString()

            if (EnterAge == "20") {
                textView2.text = "XXXtentacion (Rapper), 1998-2018"
            }
            else  if (EnterAge == "21"){
                textView2.text = "Juice WRLD (Rapper), 1998-2019"
        }
            else  if (EnterAge == "22") {
                textView2.text = "Aaliyah (Singer), 1979-2001"
            }
            else  if (EnterAge == "23") {
                textView2.text = "Gavrilo Princip (Revolutionary), 1894-1918"
            }
            else  if (EnterAge == "24") {
                textView2.text = "The Notorious B.I.G (Rapper), 1972-1997"
            }
            else  if (EnterAge == "25") {
                textView2.text = "Tupac (Rapper), 1971-1996"
            }
            else  if (EnterAge == "26") {
                textView2.text = "Mac Miller (Rapper), 1992-2018"
            }
            else  if (EnterAge == "27") {
                textView2.text = "Kurt Cobain (Musician), 1967-1994"
            }
            else  if (EnterAge == "28") {
                textView2.text = "Heath Ledger (Actor), 1979-2008"
            }
            else  if (EnterAge == "29") {
                textView2.text = "Reeva Steenkamp (Model), 1983-2013"
            }
            else  if (EnterAge == "30") {
                textView2.text = "Eazy-E (Rapper), 1964-1995"
            }
            else  if (EnterAge == "31") {
                textView2.text = "Cory Monteith (Actor), 1982-2013"
            }
            else  if (EnterAge == "32") {
                textView2.text = "Bruce Lee (Actor), 1940-1973"
            }
            else  if (EnterAge == "33") {
                textView2.text = "Nipsey Hussle (Rapper), 1985-2019"
            }
            else  if (EnterAge == "34") {
                textView2.text = "Owen Hart (Wrestler), 1965-1999"
            }
            else  if (EnterAge == "35") {
                textView2.text = "Wolfgang Mozart (Composer), 1756-1791"
            }
            else  if (EnterAge == "36") {
                textView2.text = "Princess Diana (Princess of Wales), 1961-1997"
            }
            else  if (EnterAge == "37") {
                textView2.text = "Vincent Van Gogh (Artist), 1853-1890"
            }
            else  if (EnterAge == "38") {
                textView2.text = "Eddie Guerrero (Wrestler), 1967-2005"
            }
            else  if (EnterAge == "39") {
                textView2.text = "Martin Luther King (Activist), 1929-1968"
            }
            else  if (EnterAge == "40") {
                textView2.text = "Paul Walker (Actor), 1973-2013"
            }
            else  if (EnterAge == "41") {
                textView2.text = "Kobe Bryant (Basketball player), 1978-2020"
            }
            else  if (EnterAge == "42") {
                textView2.text = "Elvis Presley (Singer), 1935-1997"
            }
            else  if (EnterAge == "43") {
                textView2.text = "Chadwick Boseman (Actor), 1976-2020"
            }
            else  if (EnterAge == "44") {
                textView2.text = "Steve Irwin (Zookeeper), 1962-2006"
            }
            else  if (EnterAge == "45") {
                textView2.text = "Freddy Mercury (Singer), 1946-1991"
            }
            else  if (EnterAge == "46") {
                textView2.text = "Jock Zonfrillo (Chef), 1976-2023"
            }
            else  if (EnterAge == "47") {
                textView2.text = "Ken Miles (Race car driver), 1918-1966"
            }
            else  if (EnterAge == "48") {
                textView2.text = "Whitney Houston (Singer), 1963-2012"
            }
            else  if (EnterAge == "49") {
                textView2.text = "Chester Williams (Rugby Player), 1970-2019"
            }
            else  if (EnterAge == "50") {
                textView2.text = "Michael Jackson (Singer), 1958-2009"
            }
            else  if (EnterAge == "51") {
                textView2.text = "Edouard Manet (Artist), 1832-1883"
            }
            else  if (EnterAge == "52") {
                textView2.text = "Luke Perry (Actor), 1966-2019"
            }
            else  if (EnterAge == "53") {
                textView2.text = "George Michael (Singer), 1963-2016"
            }
            else  if (EnterAge == "54") {
                textView2.text = "Matthew Perry (Actor), 1969-2023"
            }
            else  if (EnterAge == "55") {
                textView2.text = "Ken Block (Racing Driver), 1967-2023"
            }
            else  if (EnterAge == "56") {
                textView2.text = "Adolf Hitler (Leader of Germany), 1889-1945"
            }
            else  if (EnterAge == "57") {
                textView2.text = "Patrick Swayze (Actor), 1952-2009"
            }
            else  if (EnterAge == "58") {
                textView2.text = "Andy Warhol (Artist), 1928-1987"
            }
            else  if (EnterAge == "59") {
                textView2.text = "Rock Hudson (Actor), 1925-1985"
            }
            else  if (EnterAge == "60") {
                textView2.text = "Diego Maradona (Footballer), 1960-2020"
            }
            else  if (EnterAge == "61") {
                textView2.text = "Anthony Bourdain (Chef), 1956-2018"
            }
            else  if (EnterAge == "62") {
                textView2.text = "J.Robert Oppenheimer (Physicist), 1904-1967"
            }
            else  if (EnterAge == "63") {
                textView2.text = "Wilt Chamberlain (Basketball Player), 1936-1999"
            }
            else  if (EnterAge == "64") {
                textView2.text = "Jacqueline Kennedy Onassis (First Lady), 1929-1994"
            }
            else  if (EnterAge == "65") {
                textView2.text = "Walt Disney (Film Producer), 1901-1966"
            }
            else  if (EnterAge == "66") {
                textView2.text = "Mark Rothko (Painter), 1903-1970"
            }
            else  if (EnterAge == "67") {
                textView2.text = "Leonardo Da Vinci (Painter), 1452-1519"
            }
            else  if (EnterAge == "68") {
                textView2.text = "Johan Cruyff (Footballer), 1947-2016"
            }
            else  if (EnterAge == "69") {
                textView2.text = "David Bowie (Singer), 1947-2016"
            }
            else  if (EnterAge == "70") {
                textView2.text = "Austin Wells (Director), 1915-1985"
            }
            else  if (EnterAge == "71") {
                textView2.text = "Johnny Cash (Singer), 1932-2003"
            }
            else  if (EnterAge == "72") {
                textView2.text = "John Wayne (Actor), 1907-1979"
            }
            else  if (EnterAge == "73") {
                textView2.text = "Charles Darwin (Philospher), 1809-1882"
            }
            else  if (EnterAge == "74") {
                textView2.text = "Muhammad Ali (Boxer), 1942-2016"
            }
            else  if (EnterAge == "75") {
                textView2.text = "Rocky Johnson (Wrestler), 1944-2020"
            }
            else  if (EnterAge == "76") {
                textView2.text = "Stephen Hawking (Theoretical Physicist), 1942-2018"
            }
            else  if (EnterAge == "77") {
                textView2.text = "Mike Proctot (Cricketer), 1946-2024"
            }
            else  if (EnterAge == "78") {
                textView2.text = "Mahatma Gandhi (Activist), 1869-1948"
            }
            else  if (EnterAge == "79") {
                textView2.text = "Ferenc Puskas (Footballer), 1927-2006"
            }
            else  if (EnterAge == "80") {
                textView2.text = "P.T Barnum (Mayor), 1810-1891"
            }
            else  if (EnterAge == "81") {
                textView2.text = "Richard Nixon (President), 1913-1994"
            }
            else  if (EnterAge == "82") {
                textView2.text = "Pele (Footballer), 1940-2022"
            }
            else  if (EnterAge == "83") {
                textView2.text = "Henry Ford (Car Builder), 1863-1947"
            }
            else  if (EnterAge == "84") {
                textView2.text = "Salvadore Dali (Artist), 1904-1989"
            }
            else  if (EnterAge == "85") {
                textView2.text = "F.W de Klerk (President), 1936-2021"
            }
            else  if (EnterAge == "86") {
                textView2.text = "Claude Monet (Painter), 1840-1926"
            }
            else  if (EnterAge == "87") {
                textView2.text = "Dr Seuss (Childrens Author), 1904-1991"
            }
            else  if (EnterAge == "88") {
                textView2.text = "Wilbur Smith (Novelist), 1933-2021"
            }
            else  if (EnterAge == "89") {
                textView2.text = "Carrol Shelby (Car Builder), 1923-2012"
            }
            else  if (EnterAge == "90") {
                textView2.text = "Desmond Tutu (Activist), 1931-2021"
            }
            else  if (EnterAge == "91") {
                textView2.text = "Hugh Hefner (Playboy), 1926-2017"
            }
            else  if (EnterAge == "92") {
                textView2.text = "Sir Donald Bradman (Cricketer), 1908-2001"
            }
            else  if (EnterAge == "93") {
                textView2.text = "Ronald Reagan (President), 1911-2004"
            }
            else  if (EnterAge == "94") {
                textView2.text = "John The Apostle (Saint), 11AD-99AD"
            }
            else  if (EnterAge == "95") {
                textView2.text = "Nelson Mandela (President), 1918-2013"
            }
            else  if (EnterAge == "96") {
                textView2.text = "Queen Elizabeth II (Queen), 1926-2022 "
            }
            else  if (EnterAge == "97") {
                textView2.text = "John D.Rockefeller (Philanthropist), 1839-1937"
            }
            else  if (EnterAge == "98") {
                textView2.text = "Georgia O'Keeffe (Artist), 1887-1986"
            }
            else  if (EnterAge == "99") {
                textView2.text = "Betty White (Actress), 1922-2021"
            }
            else  if (EnterAge == "100") {
                textView2.text = "Bob Hope (Comedian), 1903-2003"
            }
            else  {
                textView2.text = "Invalid Infomation, Please enter age between 20 and 100"
            }




        }


    }
}














