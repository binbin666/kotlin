// !API_VERSION: 1.3
// FILE: 1.kt

interface Test {
    val test: String
        get() = "OK"
}

// FILE: 2.kt
// JVM_TARGET: 1.8
// WITH_RUNTIME
interface Test2 : Test {
    @kotlin.annotations.JvmDefault
    override val test: String
        get() = super.test
}


class TestClass : Test2 {

}


fun box(): String {
    return TestClass().test
}
