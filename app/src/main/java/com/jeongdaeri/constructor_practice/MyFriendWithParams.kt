package com.jeongdaeri.constructor_practice

import android.location.Address
import android.util.Log


// 매개변수를 가지는 친구 클래스
class MyFriendWithParams(var name: String?,
                         var age: Int?,
                         var isMarried: Boolean?,
                         var nickname: String?) {

    val TAG: String = "로그"

    var address: String = ""

    // 이니시 시작
    // 기본 생성자
    init {
        Log.d(TAG, "MyFriendWithParams - init() called")
        this.name = "할아범"
        this.age = 100
        this.isMarried = true
        this.nickname = "꼰대"

    }

    // 추가 생성자
    constructor(name: String?,
                age: Int?,
                isMarried: Boolean?,
                nickname: String?,
                address: String): this(name, age, isMarried, nickname){
        this.address = address
    }


//    // 추가생성자
//    constructor(name: String?,
//                age: Int?,
//                isMarried: Boolean?,
//                nickname: String?,
//                address: String) : this(name, age, isMarried, nickname) {
//
//        this.address = address
//
//    }

}
