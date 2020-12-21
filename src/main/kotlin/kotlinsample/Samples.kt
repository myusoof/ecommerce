package kotlinsample

import java.util.*
import java.time.DayOfWeek

import java.util.EnumMap


object Samples {
    @JvmStatic
    fun main(args: Array<String>) {
        val activityMap = EnumMap<TypeEnum, String>(TypeEnum::class.java)
        activityMap.put(TypeEnum.ONE, TypeEnum.ONE.test)
        println(activityMap.get(TypeEnum.ONE))
    }
}

enum class TypeEnum(val test: String) {
    ONE("one"),
    TWO("two"),
    THREE("three")
}