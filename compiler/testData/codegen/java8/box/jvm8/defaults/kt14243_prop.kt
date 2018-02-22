// !API_VERSION: 1.3
// JVM_TARGET: 1.8
// WITH_RUNTIME

interface Z<T> {

    val value: T

    @kotlin.annotations.JvmDefault
    val z: T
        get() = value
}

open class ZImpl : Z<String> {
    override val value: String
        get() = "OK"
}

open class ZImpl2 : ZImpl() {
    override val z: String
        get() = super.z
}


fun box(): String {
    return ZImpl2().value
}