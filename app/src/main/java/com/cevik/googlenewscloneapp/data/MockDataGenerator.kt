package com.cevik.googlenewscloneapp.data

import com.cevik.googlenewscloneapp.R
import com.cevik.googlenewscloneapp.model.NewsModel

class MockDataGenerator {

    fun generateNewsList(count:Int):List<NewsModel> {
        var newsList = arrayListOf<NewsModel>()
        val bigCardModel = NewsModel(
          picture = R.drawable.bigcardtop,
            channelName = "SCREEN RANT",
            topic = "You Season 3 Twist Ending Explained: Every Question Answered",
            date = "34 min ago",
            detail="You season 3 has finally arrived on Netflix, giving its audience a twisted new definition of \"happily ever after\". Based on the novels by Caroline Kepnes, You was originally produced for Lifetime and was later added to Netflix's lineup of programing when the studio passed on a second season.\n"
                    +"The psychological thriller has gained a massive following, mainly because of its charismatic lead Joe Goldberg (Penn Badgley), who defies the conventions of a romantic hero and instead, manipulates his way into the lives of his obsessions.\n"
                    +"While the concept is not necessarily new in literature, the show has a disturbing take on justifying Joe’s motives for stalking and killing in order to manufacture an ideal romance. In the process, You deconstructs the typical behavior of male heroes by removing the rose-colored lens of romantic stories and presenting a realistic, albeit troubling, view of the boy-meets-girl storyline.",
            bigCard = true
        )
        val smallCardModel = NewsModel(
            picture = R.drawable.smallcardtop,
            channelName = "CNN politics",
            topic = "FBI at Washington home of Russian oligarch Oleg Deripaska\"",
            date = "an hour ago",
            detail="The FBI is conducting \"law enforcement activity\" at the Washington, DC, home of Russian oligarch Oleg Deripaska, an ally of Russian President Vladimir Putin, according to an FBI spokesman.\n" +
                    "\n" +
                    "The activity is connected to a federal investigation out of New York, the spokesperson said, but could not provide any more information. A source familiar with the matter said the investigation has been \"ongoing\" but also provided no further details.\n" +
                    "At the home, the driveway was closed off by police tape labeled \"crime scene do not enter\" with several law enforcement cars parked on the street outside. An FBI agent guarded the driveway, and several other agents were seen going in and out of the large home in Washington's Kalorama neighborhood.",
            bigCard = false
        )
        repeat(count){
            when(it){
                0,7->{
                    newsList.add(bigCardModel)
                }
                else->{
                    newsList.add(smallCardModel)
                }
            }
        }
        return newsList


    }
}