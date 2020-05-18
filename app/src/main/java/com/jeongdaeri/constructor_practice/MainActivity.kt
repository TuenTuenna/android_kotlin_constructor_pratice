package com.jeongdaeri.constructor_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity - onCreate() called")


        var myFriend = MyFriend()

        Log.d(TAG, "MainActivity - myFriend.name : ${myFriend.name}")
        Log.d(TAG, "MainActivity - myFriend.age : ${myFriend.age}")
        Log.d(TAG, "MainActivity - myFriend.isMarried : ${myFriend.isMarried}")
        Log.d(TAG, "MainActivity - myFriend.nickname : ${myFriend.nickname}")


        // 매개변수가 들어가는 생성자
        var myFriendChulsoo = MyFriendWithParams(name = "철수",
                                                age = 17,
                                                isMarried = false,
                                                nickname = "안철수")

        Log.d(TAG, "MainActivity - myFriendChulsoo.name : ${myFriendChulsoo.name}")
        Log.d(TAG, "MainActivity - myFriendChulsoo.age : ${myFriendChulsoo.age}")
        Log.d(TAG, "MainActivity - myFriendChulsoo.isMarried : ${myFriendChulsoo.isMarried}")
        Log.d(TAG, "MainActivity - myFriendChulsoo.nickname : ${myFriendChulsoo.nickname}")


        // 매개변수가 들어가는 생성자
        var myFriendYoungSoo = MyFriendWithParams(name = "영수",
            age = 20,
            isMarried = false,
            nickname = "국영수",
            address = "대한민국"
            )

        // 매개변수가 들어가는 생성자
        var myFriendSoosan = MyFriendWithParams(name = "sdf",
            age = 20,
            isMarried = false,
            nickname = "hoho"
        )

        // 추가 생성자로 되어있는 친구 객체
        var myFriendJames_1 = MyFriendWithMoreParams()
        Log.d(TAG, "MainActivity - myFriendJames.name : ${myFriendJames_1.name}")

        var myFriendJames_2 = MyFriendWithMoreParams(name = "제임스")

        Log.d(TAG, "MainActivity - myFriendJames.name : ${myFriendJames_2.name}")

        var myFriendJames_3 = MyFriendWithMoreParams(name = "제임스",
                                                    age = 50,
                                                    isMarried = false,
                                                    nickname = "본드")

        Log.d(TAG, "MainActivity - myFriendJames.name : ${myFriendJames_3.name}")
        Log.d(TAG, "MainActivity - myFriendJames.age : ${myFriendJames_3.age}")
        Log.d(TAG, "MainActivity - myFriendJames.isMarreid : ${myFriendJames_3.isMarried}")
        Log.d(TAG, "MainActivity - myFriendJames.nickname : ${myFriendJames_3.nickname}")

        // 유연하게 객체를 생성하고 싶어요
//        var myTrueFriend = MyFriend().age
        // 다음 영상에서 보여드리겠습니다!
        // 디자인 패턴 빌더

    }












}
