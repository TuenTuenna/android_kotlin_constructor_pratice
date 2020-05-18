package com.jeongdaeri.constructor_practice

import android.util.Log


// 추가 생성자로 되어있는 친구 클래스
class MyFriendWithMoreParams() {

    val TAG: String = "로그"

    // 맴버변수
    var name: String? = null
    var age: Int? = null
    var isMarried: Boolean? = null
    var nickname: String? = null

    // 기본생성자
    init {
        Log.d(TAG, "MyFriendWithMoreParams - init() called")
        this.name = "길동이"
    }


    // 추가생성자
    constructor(name: String) : this() {
        Log.d(TAG, "MyFriendWithMoreParams - name 생성자() called")
        this.name = name
    }

    // 추가생성자
    constructor(name: String, age: Int) : this() {
        Log.d(TAG, "MyFriendWithMoreParams - name, age 생성자() called")
        this.name = name
        this.age = age
    }

    // 추가생성자
    constructor(name: String, age: Int, isMarried: Boolean) : this() {
        Log.d(TAG, "MyFriendWithMoreParams - name, age, isMarried 생성자() called")
        this.name = name
        this.age = age
        this.isMarried = isMarried
    }

    // 추가생성자
    constructor(name: String, age: Int, isMarried: Boolean, nickname: String) : this() {
        Log.d(TAG, "MyFriendWithMoreParams - name, age, isMarried, nickname 생성자() called")
        this.name = name
        this.age = age
        this.isMarried = isMarried
        this.nickname = nickname
    }


}
