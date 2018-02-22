// !DIAGNOSTICS: -EXPERIMENTAL_OVERRIDE
// !API_VERSION: 1.3
// !JVM_TARGET: 1.8
interface A {
    @kotlin.annotations.JvmDefault
    fun test() {}
}

interface ANonDefault {
    fun test() {}
}

interface B: A {
    <!JVM_DEFAULT_REQUIRED_FOR_OVERLOAD!>override fun test() {}<!>
}

interface C: ANonDefault, A {
    <!JVM_DEFAULT_REQUIRED_FOR_OVERLOAD!>override fun test() {}<!>
}

interface D: A, ANonDefault {
    <!JVM_DEFAULT_REQUIRED_FOR_OVERLOAD!>override fun test() {}<!>
}