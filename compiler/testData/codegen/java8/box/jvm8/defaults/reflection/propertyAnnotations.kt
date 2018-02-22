// !API_VERSION: 1.3
// JVM_TARGET: 1.8
// WITH_REFLECT

annotation class Property(val value: String)
annotation class Accessor(val value: String)

interface Z {
    @Property("OK")
    @kotlin.annotations.JvmDefault
    val z: String
        @Accessor("OK")
        get() = "OK"
}


class Test : Z

fun box() : String {
    val value = (Z::z.annotations.filterIsInstance<Property>().single() as Property).value
    if (value != "OK") return value
    return (Z::z.getter.annotations.single() as Accessor).value
}